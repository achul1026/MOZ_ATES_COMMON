package com.moz.ates.traffic.common.repository.equipment;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.equipment.MozTfcEnfFileInfo;

@Mapper
public interface MozTfcEnfFileInfoRepository {
	
	/**
	 * @brief : 단속 정보 첨부파일 등록
	 * @details : 단속 정보 첨부파일 등록
	 * @author : CM.KIM
	 * @date : 2024.02.20
	 * @param : MozTfcEnfFileInfo mozTfcEnfFileInfo
	 */
    public void insertTfcEnfFileInfo(MozTfcEnfFileInfo mozTfcEnfFileInfo);
    
	/**
     * @brief : 단속정보 첨부파일 조회
     * @details : 단속정보 첨부파일 조회
     * @author : KY.LEE
     * @date : 2024.02.20
     * @param : String tfcEnfId
     * @return : List<MozTfcEnfFileInfo>
     */
    List<MozTfcEnfFileInfo> findTfcEnfFileInfoByTfcEnfId(String tfcEnfId);

    /**
     * @brief : 첨부파일 정보조회
     * @details : 첨부파일 정보조회
     * @author : KY.LEE
     * @date : 2024.02.20
     * @param : String vioFileId
     * @return : MozTfcEnfFileInfo
     */
	public MozTfcEnfFileInfo findOneByMozTfcEnfFileInfoByVioFileId(String vioFileId);

	/**
     * @brief : 교통단속 - 첨부 파일 삭제
     * @details : 교통단속 - 첨부 파일 삭제
     * @author : KC.KIM
     * @date : 2024.03.11
     * @param : tfcEnfId
     * @return : 
     */
	public void deleteTfcEnfFileInfoByTfcEnfId(String tfcEnfId);

	/**
     * @brief : 교통단속 - 첨부 파일 삭제
     * @details : 교통단속 - 첨부 파일 삭제
     * @author : KC.KIM
     * @date : 2024.03.11
     * @param : vioFileNo
     * @return : 
     */
	public void deleteMozTfcEnfFileInfoByVioFileNo(String vioFileNo);
}
