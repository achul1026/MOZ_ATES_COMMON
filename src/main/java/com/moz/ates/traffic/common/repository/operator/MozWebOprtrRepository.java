package com.moz.ates.traffic.common.repository.operator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.operator.MozWebOprtr;

@Mapper
public interface MozWebOprtrRepository {
	public MozWebOprtr selectUserById(MozWebOprtr webOprtr);
	
	public int selectDupliChk(MozWebOprtr webOprtr);
	
	public MozWebOprtr selectUserByUserId(MozWebOprtr webOprtr);
	
	public List<MozWebOprtr> selectUserList(MozWebOprtr webOprtr);
	
	public int selectUserListCnt(MozWebOprtr webOprtr);
	
	public MozWebOprtr selectUserDetail(String oprtrId);
	
	public void insertUser(MozWebOprtr webOprtr);
	
	public void updateUser(MozWebOprtr webOprtr);
	
    /**
     * @brief : 관리자 등록
     * @details : 관리자 등록
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : webOprtr
     * @return : 
     */
	public void saveMozWebOprtr(MozWebOprtr webOprtr);

    /**
     * @brief : 아이디 중복 조회
     * @details : 아이디 중복 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : webOprtr
     * @return : 
     */
	public int countMozWebOprtrForDuplChk(MozWebOprtr webOprtr);

    /**
     * @brief : 사용자 리스트 조회
     * @details : 사용자 리스트 조회
     * @author : KC.KIM
     * @date : 2023.08.18
     * @param : webOprtr
     * @return : 
     */
	public List<MozWebOprtr> findAllMozWebOprtr(MozWebOprtr webOprtr);

    /**
     * @brief : 사용자 리스트 개수 조회 
     * @details : 사용자 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2023.08.18
     * @param : webOprtr
     * @return : 
     */
	public int countMozWebOprtr(MozWebOprtr webOprtr);

    /**
     * @brief : 관리자 상세 조회
     * @details : 관리자 상세 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : oprtrId
     * @return : 
     */
	public MozWebOprtr findOneMozWebOprtr(String oprtrId);

    /**
     * @brief : 관리자 수정
     * @details : 관리자 수정
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : webOprtr
     * @return : 
     */
	public void updateMozWebOprtr(MozWebOprtr webOprtr);
}
