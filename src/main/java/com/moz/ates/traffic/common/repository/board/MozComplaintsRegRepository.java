package com.moz.ates.traffic.common.repository.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.board.MozComplaintsReg;

@Mapper
public interface MozComplaintsRegRepository {
	public void insertComaplainInfo(MozComplaintsReg complaintsReg);
	
	public void updateCmpAns(MozComplaintsReg complaintsReg);

    /**
     * @brief : 불만사항 리스트 조회
     * @details : 불만사항 리스트 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : complaintsReg
     * @return : 
     */
	public List<MozComplaintsReg> findAllMozComplaintReg(MozComplaintsReg complaintsReg);

    /**
     * @brief : 불만사항 리스트 개수 조회
     * @details : 불만사항 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : complaintsReg
     * @return : 
     */
	public int countMozComplaintReg(MozComplaintsReg complaintsReg);
	
    /**
     * @brief : 불만사항 상세 조회
     * @details : 불만사항 상세
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : complaintsIdx
     * @return : 
     */
	public MozComplaintsReg findOneComplaintDetail(String complaintsIdx);
}
