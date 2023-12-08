package com.moz.ates.traffic.common.repository.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.board.MozObjReg;

@Mapper
public interface MozObjRegRepository {
	public void insertObjectionInfo(MozObjReg objReg);
	
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

}
