package com.moz.ates.traffic.common.repository.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.board.MozBrd;

@Mapper
public interface MozBrdRepository {
	
	public List<MozBrd> selectNoticeList(MozBrd brd);
	
	public int selectNoticeListCnt(MozBrd brd);
	
	public MozBrd selectNoticeDetail(String boardIdx);
	
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
}
