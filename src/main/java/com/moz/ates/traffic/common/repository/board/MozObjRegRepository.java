package com.moz.ates.traffic.common.repository.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.board.MozObjReg;

@Mapper
public interface MozObjRegRepository {
	
	public void updateObjAns(MozObjReg objReg);

    /**
     * @brief : 이의제기 리스트 조회
     * @details : 이의제기 리스트 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : objIdx
     * @return : 
     */
	public List<MozObjReg> findAllMozObjReg(MozObjReg objReg);

    /**
     * @brief : 이의제기 리스트 개수 조회
     * @details : 이의제기 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : objIdx
     * @return : 
     */
	public int countMozObjReg(MozObjReg objReg);

    /**
     * @brief : 이의제기 상세 조회
     * @details : 이의제기 상세 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : objIdx
     * @return : 
     */
	public MozObjReg findOneMozObjReg(String objIdx);
	
//************************* for Portal start
	
	/**
	  * @Method Name : countAllMozObjReg
	  * @Date : 2024. 4. 5.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 이의제기 카운트 조회
	  * @param objReg
	  * @return
	  */
	public int countAllMozObjRegJoinMozFineNtcInfoAndMozCmCd(MozObjReg objReg);
	
	/**
	  * @Method Name : findAllMozObjRegJoinMozFineNtcInfoAndMozCmCd
	  * @Date : 2024. 4. 5.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 이의제기 리스트 조회
	  * @param objReg
	  * @return
	  */
	public List<MozObjReg> findAllMozObjRegJoinMozFineNtcInfoAndMozCmCd(MozObjReg objReg);
	
	/**
	  * @Method Name : findOnePostPwbyObjIdx
	  * @Date : 2024. 4. 5.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 이의제기 게시물 비밀번호 조회
	  * @param objReg
	  * @return
	  */
	public String findOnePostPwbyObjIdx(MozObjReg objReg);
	
	/**
	  * @Method Name : findOneMozObjRegJoinMozFineNtcInfoAndMozWebOprtrAndMozCmCdByObjIdx
	  * @Date : 2024. 4. 5.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 이의제기 상세 조회
	  * @param objReg
	  * @return
	  */
	public MozObjReg findOneMozObjRegJoinMozFineNtcInfoAndMozWebOprtrAndMozCmCdByObjIdx(MozObjReg objReg);
	
	/**
	  * @Method Name : saveMozObjReg
	  * @Date : 2024. 4. 7.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 이의제기 저장
	  * @param objReg
	  */
	public void saveMozObjReg(MozObjReg objReg);
	
	/**
	  * @Method Name : updateMojObjRegPost
	  * @Date : 2024. 4. 7.
	  * @Author : IK.MOON
	  * @Method Brief : 포털 이의제기 수정
	  * @param objReg
	  */
	public void updateMojObjRegPost(MozObjReg objReg);
	
//************************* for Portal end

}
