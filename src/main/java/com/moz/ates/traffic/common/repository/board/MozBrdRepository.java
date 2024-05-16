package com.moz.ates.traffic.common.repository.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.board.MozBrd;

@Mapper
public interface MozBrdRepository {
	
	public List<MozBrd> findAllNoticeList(MozBrd brd);
	
	public int countNoticeListCnt(MozBrd brd);
	
	public MozBrd findOneNoticeDetail(String boardIdx);
	
	public void insertNotice(MozBrd brd);
	
	public void updateNotice(MozBrd brd);
	
	public void deleteNotice(String boardIdx);
    /**
     * @brief : 공지사항 리스트 조회
     * @details : 공지사항 리스트 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : brd
     * @return : 
     */
	public List<MozBrd> findAllMozBrd(MozBrd brd);
    /**
     * @brief : 공지사항 리스트 개수 조회
     * @details : 공지사항 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : brd
     * @return : 
     */
	public int countMozBrd(MozBrd brd);

	/**
     * @brief : 공지사항 등록
     * @details : 공지사항 등록
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : brd
     * @return : 
     */
	public void saveMozBrd(MozBrd brd);
	
	
//************************* for Portal start
	/**
	  * @Method Name : findAllByUseYn
	  * @Date : 2024. 2. 23.
	  * @Author : IK.MOON
	  * @Method Brief : 공지사항 리스트 조회
	  * @param brd
	  * @return
	  */
	public List<MozBrd> findAllByUseYn(MozBrd brd);
	
	/**
	  * @Method Name : countByUseYn
	  * @Date : 2024. 2. 23.
	  * @Author : IK.MOON
	  * @Method Brief : 공지사항 count 조회
	  * @param brd
	  * @return
	  */
	public int countByUseYn(MozBrd brd);
	
	/**
	  * @Method Name : findOneByBoardIdx
	  * @Date : 2024. 2. 23.
	  * @Author : IK.MOON
	  * @Method Brief : 공지사항 상세 조회
	  * @param boardIdx
	  * @return
	  */
	public MozBrd findOneByBoardIdxAndUseYnAndCateCd(MozBrd mozBrd);
	
	/**
	  * @Method Name : updateViewCnt
	  * @Date : 2024. 2. 23.
	  * @Author : IK.MOON
	  * @Method Brief : 공지사항 조회수 증가
	  * @param boardIdx
	  */
	public void updateViewCnt(MozBrd mozBrd);
	
//************************* for Portal end
	
}
