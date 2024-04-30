package com.moz.ates.traffic.common.repository.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.board.MozAtchFile;

@Mapper
public interface MozAtchFileRepository {

	
	/**
	 * @brief : 포털 파일 정보 조회
	 * @details : 포털 파일 정보 조회
	 * @author : KC.KIM
	 * @date : 2024.02.23
	 * @param : atchIdx
	 * @return : 
	 */
	public MozAtchFile findOneMozAtchFileByAtchFileIdx(String atchIdx);

	/**
     * @brief : 포털 파일 정보 저장
     * @details : 포털 파일 정보 저장
     * @author : KC.KIM
     * @date : 2024.02.23
     * @param : atchFile
     * @return : 
     */
	public void insertMozAtchFile(MozAtchFile atchFile);

	/**
     * @brief : 포털 파일 정보 삭제
     * @details : 포털 파일 정보 삭제
     * @author : KC.KIM
     * @date : 2024.02.23
     * @param : fileIdx
     * @return : 
     */
	public void deleteMozAtchFileByFileIdx(String fileIdx);

	/**
     * @brief : 포털 파일 정보 수정
     * @details : 포털 파일 정보 수정
     * @author : KC.KIM
     * @date : 2024.02.23
     * @param : atchFile
     * @return : 
     */
	public void updateMozAtchFile(MozAtchFile atchFile);

	/**
	  * @Method Name : findOneMozAtchFileByFileIdx
	  * @작성일 : 2024. 3. 12.
	  * @작성자 : SM.KIM
	  * @Method 설명 : 포털 파일 정보 조회
	  * @param fileIdx
	  * @return
	  */
	public MozAtchFile findOneMozAtchFileByFileIdx(String fileIdx);

	/**
     * @brief : 문의하기 답변 파일 조회
     * @details : 문의하기 답변 파일 조회
     * @author : KC.KIM
     * @date : 2024.04.16
     * @param : inqryId
     * @return : 
     */
	public List<MozAtchFile> findAllMozAtchFileByAtchIdx(String inqryId);
}
