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
	
	
//************************* for Portal start
	
	/**
	  * @Method Name : countAllMozComplaintsReg
	  * @Date : 2024. 3. 29.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 민원 카운트 조회
	  * @param mozComplaintsReg
	  * @return
	  */
	public int countAllMozComplaintsReg(MozComplaintsReg mozComplaintsReg);
	
	/**
	  * @Method Name : findAllMozComplaintsRegJoinMozCmCd
	  * @Date : 2024. 3. 29.
	  * @Author : IK.MOON
	  * @Method Brief : 포텋 민원 리스트 조회
	  * @param mozComplaintsReg
	  * @return
	  */
	public List<MozComplaintsReg> findAllMozComplaintsRegJoinMozCmCd(MozComplaintsReg mozComplaintsReg);
	
	/**
	  * @Method Name : findOnePostPwByComplaintsIdx
	  * @Date : 2024. 3. 29.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 민원 패스워드 조회
	  * @param mozComplaintsReg
	  * @return
	  */
	public String findOnePostPwByComplaintsIdx(MozComplaintsReg mozComplaintsReg);
	
	/**
	  * @Method Name : findOneMozComplaintsRegJoinMozCmCdAndMozWebOprtrByComplaintsIdx
	  * @Date : 2024. 3. 29.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 민원 상세 조회
	  * @param mozComplaintsReg
	  * @return
	  */
	public MozComplaintsReg findOneMozComplaintsRegJoinMozCmCdAndMozWebOprtrByComplaintsIdx(MozComplaintsReg mozComplaintsReg);
	
//************************* for Portal end
}
