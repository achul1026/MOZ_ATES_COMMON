package com.moz.ates.traffic.common.component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.moz.ates.traffic.common.entity.common.UploadFileInfo;
import com.moz.ates.traffic.common.enums.FileUploadType;
import com.moz.ates.traffic.common.repository.accident.MozTfcAcdntFileInfoRepository;
import com.moz.ates.traffic.common.repository.driver.MozVioInfoRepository;
import com.moz.ates.traffic.common.repository.equipment.MozTfcEnfFileInfoRepository;
import com.moz.ates.traffic.common.support.exception.CommonException;
import com.moz.ates.traffic.common.support.exception.ErrorCode;
import com.moz.ates.traffic.common.util.MozatesCommonUtils;


@Component
public class FileUploadComponent {
	
	@Value("${file.path.enforcement}")
	private String filePath;

	@Value("${file.path.enforcement}")
	private String enfFilePath;
	
	@Value("${file.path.accident}")
	private String acdntFilePath;
	
	@Value("${file.path.equipment}")
	private String eqpmntFilePath;
	
	@Value("${file.path.common}")
	private String commonFilePath;
	
	@Value("${file.path.violator}")
	private String vioFilePath;
	
	@Value("${file.path.facility}")
	private String facFilePath;
	
	@Value("${file.path.qna}")
	private String qnaFilePath;
	
	@Value("${file.path.complaints}")
	private String cmplnFilePath;
	
	@Value("${file.path.objections}")
	private String objFilePath;
	
	@Autowired
	MozVioInfoRepository mozVioInfoRepository;
	
	@Autowired
	MozTfcEnfFileInfoRepository mozTfcEnfFileInfoRepository;
	
	@Autowired
	MozTfcAcdntFileInfoRepository mozTfcAcdntFileInfoRepository;
	
	
	/**
	 * @Method Name : uploadFileToUploadFileInfo
	 * @작성일 : 2023. 10. 31.
	 * @작성자 : KY.LEE
	 * @Method 설명 : 단일 파일 업로드
	 * @return UploadFileInfo (업로드 파일 정보)
	 */
	public UploadFileInfo uploadFileToUploadFileInfo(MultipartFile file){
		UploadFileInfo uploadFileInfo = new UploadFileInfo();
		
//		String fileOrginalNm = encodeFileOrgName(file);
		String fileNm = generateFileNm(file.getOriginalFilename());
		String today = MozatesCommonUtils.isNowStr("yyyyMMdd").toString();
		String uploadPath = filePath + File.separator + today + File.separator + fileNm;
		Long fileSize = file.getSize();
		String ext = fileNm.substring(fileNm.lastIndexOf(".")+1, fileNm.length());
		
		File uploadFile = new File(uploadPath);
		FileOutputStream fo = null;
		try {
			if(!file.isEmpty()) {
				fo = new FileOutputStream(uploadFile);
				byte[] fileBytes = file.getBytes();
				fo.write(fileBytes);
				uploadFileInfo.setAtchFile(fileBytes);
			}
		} catch (IOException e) {
			throw new CommonException(ErrorCode.FILE_UPLOAD_FAIL);
		} finally {
			if(fo != null) {
				try {
					fo.close();
				} catch (IOException e) {
					throw new CommonException(ErrorCode.FILE_UPLOAD_FAIL);
				}
			}
		}
		uploadFileInfo.setFileNm(fileNm);
		uploadFileInfo.setOriginalFileNm(file.getOriginalFilename());
		uploadFileInfo.setUploadTime(today);
		uploadFileInfo.setFilePath(uploadPath);
		uploadFileInfo.setFileSize(fileSize);
		uploadFileInfo.setFileExt(ext);
		
		return uploadFileInfo;
	}
	
	/**
	 * @Method Name : uploadFileToUploadFileInfoChkExtension
	 * @작성일 : 2023. 12. 19.
	 * @작성자 : KY.LEE
	 * @Method 설명 : 단일 파일 업로드 (확장자검사)
	 * @return UploadFileInfo (업로드 파일 정보)
	 */
	public UploadFileInfo uploadFileToUploadFileInfoChkExtension(MultipartFile file,String[] extArr){
		UploadFileInfo uploadFileInfo = new UploadFileInfo();
		
//		String fileOrginalNm = encodeFileOrgName(file);
		String fileNm = generateFileNm(file.getOriginalFilename());
		String today = MozatesCommonUtils.isNowStr("yyyyMMdd").toString();
		String folderPth = makeDirectory(filePath + File.separator + today);
		String uploadPath = folderPth + File.separator + fileNm;
		Long fileSize = file.getSize();
		String ext = fileNm.substring(fileNm.lastIndexOf(".")+1, fileNm.length());
		
		if(!chkFileExt(file.getOriginalFilename(),extArr)) {
			throw new CommonException(ErrorCode.FILE_EXTENTION_MISMATCH);
		}
		
		File uploadFile = new File(uploadPath);
		FileOutputStream fo = null;
		try {
			if(!file.isEmpty()) {
				fo = new FileOutputStream(uploadFile);
				byte[] fileBytes = file.getBytes();
				fo.write(fileBytes);
				uploadFileInfo.setAtchFile(fileBytes);
			}
		} catch (IOException e) {
			throw new CommonException(ErrorCode.FILE_UPLOAD_FAIL);
		} finally {
			if(fo != null) {
				try {
					fo.close();
				} catch (IOException e) {
					throw new CommonException(ErrorCode.FILE_UPLOAD_FAIL);
				}
			}
		}
		uploadFileInfo.setFileNm(fileNm);
		uploadFileInfo.setOriginalFileNm(file.getOriginalFilename());
		uploadFileInfo.setUploadTime(today);
		uploadFileInfo.setFilePath(uploadPath);
		uploadFileInfo.setFileSize(fileSize);
		uploadFileInfo.setFileExt(ext);
		
		return uploadFileInfo;
	}
	
	/**
	 * @Method Name : uploadFilesToUploadFileInfoList
	 * @작성일 : 2023. 11. 1.
	 * @작성자 : KY.LEE
	 * @Method 설명 : 복수 파일 업로드
	 * @return List<UploadFileInfo> (업로드 파일 정보)
	 */
	public List<UploadFileInfo> uploadFilesToUploadFileInfoList(MultipartFile[] uploadFiles){
		List<UploadFileInfo> result = new ArrayList<UploadFileInfo>();
		String today = MozatesCommonUtils.isNowStr("yyyyMMdd").toString();
		String folderDir = makeDirectory(filePath + File.separator + today);
		
		if(uploadFiles != null && uploadFiles.length > 0) {
			for(MultipartFile file : uploadFiles) {
				UploadFileInfo uploadFileInfo = new UploadFileInfo();
				
//				String fileOrginalNm = encodeFileOrgName(file);
				String fileNm = generateFileNm(file.getOriginalFilename());
				
				String uploadPath = folderDir + File.separator + fileNm; 
				Long fileSize = file.getSize();
				String ext = fileNm.substring(fileNm.lastIndexOf(".")+1, fileNm.length());
				
				File uploadFile = new File(uploadPath);
				FileOutputStream fo = null;
				try {
					if(!file.isEmpty()) {
						fo = new FileOutputStream(uploadFile);
						byte[] fileBytes = file.getBytes();
						fo.write(fileBytes);
						uploadFileInfo.setAtchFile(fileBytes);
					}
				} catch (IOException e) {
					throw new CommonException(ErrorCode.FILE_UPLOAD_FAIL);
				} finally {
					if(fo != null) {
						try {
							fo.close();
						} catch (IOException e) {
							throw new CommonException(ErrorCode.FILE_UPLOAD_FAIL);
						}
					}
				}
				uploadFileInfo.setFileNm(fileNm);
				uploadFileInfo.setOriginalFileNm(file.getOriginalFilename());
				uploadFileInfo.setUploadTime(today);
				uploadFileInfo.setFilePath(uploadPath);
				uploadFileInfo.setFileSize(fileSize);
				uploadFileInfo.setFileExt(ext);
				result.add(uploadFileInfo);
			}
		}
		return result;
	}
	
	/**
	 * @Method Name : uploadFilesToUploadFileInfoListChkExtension
	 * @작성일 : 2023. 12. 19.
	 * @작성자 : KY.LEE
	 * @Method 설명 : 복수 파일 업로드 (확장자 검사)
	 * @return List<UploadFileInfo> (업로드 파일 정보)
	 */
	public List<UploadFileInfo> uploadFilesToUploadFileInfoListChkExtension(MultipartFile[] uploadFiles, String[] extArr){
		List<UploadFileInfo> result = new ArrayList<UploadFileInfo>();
		
		String today = MozatesCommonUtils.isNowStr("yyyyMMdd").toString();
		String folderDir = makeDirectory(filePath + File.separator + today);
		
		if(uploadFiles != null && uploadFiles.length > 0) {
			if(!chkfileExtList(uploadFiles,extArr)) {
				throw new CommonException(ErrorCode.FILE_EXTENTION_MISMATCH);
			}
			
			for(MultipartFile file : uploadFiles) {
				UploadFileInfo uploadFileInfo = new UploadFileInfo();
				
//				String fileOrginalNm = encodeFileOrgName(file);
				String fileNm = generateFileNm(file.getOriginalFilename());
				String uploadPath = folderDir + File.separator + fileNm;
				Long fileSize = file.getSize();
				String ext = fileNm.substring(fileNm.lastIndexOf(".")+1, fileNm.length());
				
				File uploadFile = new File(uploadPath);
				FileOutputStream fo = null;
				try {
					if(!file.isEmpty()) {
						fo = new FileOutputStream(uploadFile);
						byte[] fileBytes = file.getBytes();
						fo.write(fileBytes);
						uploadFileInfo.setAtchFile(fileBytes);
					}
				} catch (IOException e) {
					throw new CommonException(ErrorCode.FILE_UPLOAD_FAIL);
				} finally {
					if(fo != null) {
						try {
							fo.close();
						} catch (IOException e) {
							throw new CommonException(ErrorCode.FILE_UPLOAD_FAIL);
						}
					}
				}
				uploadFileInfo.setFileNm(fileNm);
				uploadFileInfo.setOriginalFileNm(file.getOriginalFilename());
				uploadFileInfo.setUploadTime(today);
				uploadFileInfo.setFilePath(uploadPath);
				uploadFileInfo.setFileSize(fileSize);
				uploadFileInfo.setFileExt(ext);
				
				result.add(uploadFileInfo);
			}
		}
		return result;
	}
	
	/**
     * @Method Name : encodeFileOrgName
     * @작성일 : 2023. 10. 31.
     * @작성자 : KY.LEE
     * @Method 설명 : 파일이름 인코딩
     * @return
     */
	public static String encodeFileOrgName(MultipartFile file){
		String encFileNm = "";
		try {
			encFileNm = new String(file.getOriginalFilename().getBytes("8859_1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			throw new CommonException(ErrorCode.FILE_UPLOAD_FAIL);
		}
		return encFileNm;
	}
	
	/**
     * @Method Name : deleteUploadFile
     * @작성일 : 2023. 10. 31.
     * @작성자 : KY.LEE
     * @Method 설명 : 파일 삭제
     * @return
     */
	public void deleteUploadFile(String filePath){
		File uploadFile = new File(filePath);
		
		if(uploadFile.exists()) {
			uploadFile.delete();
		}
	}
	
	/**
     * @Method Name : chkFileExt
     * @작성일 : 2023. 9. 11.
     * @작성자 : KC.KIM
     * @Method 설명 : 파일 확장자 체크
     * @return
     */
	public boolean chkFileExt(String fileNm, String[] arrExt) {
		boolean isContatin = false;
		if(fileNm != null) {
			String ext = fileNm.substring(fileNm.lastIndexOf(".")+1, fileNm.length());
			
			isContatin = Arrays.asList(arrExt).contains(ext);
		}
		return isContatin;
	}
	
	/**
	 * @Method Name : chkfileExtList
	 * @작성일 : 2023. 12. 19.
	 * @작성자 : KY.LEE
	 * @Method 설명 : 파일 리스트 확장자 체크
	 * @return
	 */
	public boolean chkfileExtList(MultipartFile[] uploadFiles, String[] arrExt) {
		boolean isContatin = false;
		if(uploadFiles != null && uploadFiles.length > 0) {
			for(MultipartFile file : uploadFiles) {
				String ext = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1, file.getOriginalFilename().length());
				
				isContatin = Arrays.asList(arrExt).contains(ext);
				
				if(!isContatin) {
					return false;
				}
			}
		}
		return isContatin;
	}
	
	/**
     * @Method Name : generateFileNm
     * @작성일 : 2023. 9. 11.
     * @작성자 : KC.KIM
     * @Method 설명 : 저장 파일명 생성
     * @return
     */
	private String generateFileNm(String fileNm) {		
		String uuid = MozatesCommonUtils.getUuid();
		String ext = StringUtils.getFilenameExtension(fileNm);
		return uuid + "." + ext;
	}
	
	/**
     * @Method Name : makeDirectory
     * @작성일 : 2023. 9. 11.
     * @작성자 : KC.KIM
     * @Method 설명 : 파일 경로 생성
     * @return
     */
	private String makeDirectory(String path) {
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		return dir.getPath();
	}
	
	/**
     * @Method Name : getUploadPath
     * @작성일 : 2023. 9. 11.
     * @작성자 : KC.KIM
     * @Method 설명 : 업로드 경로
     * @return
     */
	private String getUploadPath(String addPath) {
//		return makeDirectory(filePath + File.separator + addPath);
		return null;
	}
	
	/**
	  * @Method Name : fileDownload
	  * @Date : 2024. 5. 13.
	  * @Author : IK.MOON
	  * @Method Brief : 파일 다운로드
	  * @param response
	  * @param fileName
	  * @param fileOriginName
	  * @param filePath
	  * @throws IOException
	  */
	public void fileDownload(HttpServletResponse response, String fileName, String fileOriginName,
			String filePath) throws IOException {

		// filePath에 fileName이 포함되지 않은 경우
		if (MozatesCommonUtils.isNull(fileName)) {
			filePath = filePath + File.separator + fileName;
		}

		File file = new File(filePath);
		
		if (!file.exists()) {
			throw new CommonException(ErrorCode.FILE_NOT_FOUND);
		}
		
		String encodedFileName;
		if (!MozatesCommonUtils.isNull(fileOriginName)) {
			encodedFileName = URLEncoder.encode(fileOriginName, "UTF-8");
		} else {
			encodedFileName = URLEncoder.encode(fileName, "UTF-8");
		}
		
		byte[] fileByte;
		fileByte = FileUtils.readFileToByteArray(file);

		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment; fileName=\"" + encodedFileName + "\"");
		response.setContentLength(fileByte.length);

		try (FileInputStream in = new FileInputStream(file); OutputStream out = response.getOutputStream()) {
			int bytesRead = 0;
			byte[] buffer = new byte[4096];
			while ((bytesRead = in.read(buffer)) != -1) {
				out.write(buffer, 0, bytesRead);
			}
			out.flush();
		}
	}

	/**
	  * @Method Name : imgView
	  * @Date : 2024. 5. 13.
	  * @Author : IK.MOON
	  * @Method Brief : 이미지 요청
	  * @param response
	  * @param filePath
	  * @throws IOException
	  */
	public void imgView(HttpServletResponse response, String filePath) throws IOException {
		
		File file = new File(filePath);
		
		if (!file.exists()) {
			throw new CommonException(ErrorCode.FILE_NOT_FOUND);
		}
		
		int length;
		
		try(FileInputStream f = new FileInputStream(file); ServletOutputStream out = response.getOutputStream()) {
			byte[] buffer = new byte[10];
			while((length=f.read(buffer)) != -1){
				out.write(buffer,0,length);
			}
		}
	}
	
	/**
	  * @param fileUploadType 
	 * @Method Name : uploadFileToCopyFilePath
	  * @Date : 2024. 4. 09.
	  * @Author : KY.LEE
	  * @Method Brief : 이미지 복사 업로드
	  * @param filePath
	  * @return UploadFileInfo
	  */
	public UploadFileInfo uploadFileToCopyFilePath(String fileFullPath, String fileUploadType) {
		String uploadFilePath = "";
		
		switch(fileUploadType) {
			case(FileUploadType.ENFORCEMENT):
				uploadFilePath = enfFilePath;
				break;
			case(FileUploadType.ACCIDENT):
				uploadFilePath = acdntFilePath;
				break;
			case(FileUploadType.EQUPMENT):
				uploadFilePath = eqpmntFilePath;
				break;
			case(FileUploadType.FACILITY):
				uploadFilePath = facFilePath;
				break;
			case(FileUploadType.VIOLATOR):
				uploadFilePath = vioFilePath;
				break;
			case(FileUploadType.QNA):
				uploadFilePath = qnaFilePath;
				break;
			case(FileUploadType.COMPLAINTS):
				uploadFilePath = cmplnFilePath;
				break;
			case(FileUploadType.OBJECTIONS):
				uploadFilePath = objFilePath;
				break;
			default :
				uploadFilePath = commonFilePath;
				break;
		}
		UploadFileInfo uploadFileInfo = new UploadFileInfo();
        // 업로드 디렉토리의 경로
		String today = MozatesCommonUtils.isNowStr("yyyyMMdd").toString();

        File sourceFile = new File(fileFullPath);
        
        String fileOrgName = sourceFile.getName();
        String fileName = MozatesCommonUtils.getUuid(); 
        String ext = fileOrgName.substring(fileOrgName.lastIndexOf(".")+1, fileOrgName.length());
        Long fileSize = sourceFile.length();
		String UploadFullPath = uploadFilePath + File.separator + today + File.separator + fileName;

        try {
            Path sourcePath = Paths.get(fileFullPath);
            Path destinationPath = Paths.get(UploadFullPath);
            // 파일 복사 및 덮어쓰기
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
        	throw new CommonException(ErrorCode.FILE_UPLOAD_FAIL);
        }
		uploadFileInfo.setFileNm(fileName);
		uploadFileInfo.setOriginalFileNm(fileOrgName);
		uploadFileInfo.setUploadTime(today);
		uploadFileInfo.setFilePath(UploadFullPath);
		uploadFileInfo.setFileSize(fileSize);
		uploadFileInfo.setFileExt(ext);
        
		return uploadFileInfo;
	}
	
}
