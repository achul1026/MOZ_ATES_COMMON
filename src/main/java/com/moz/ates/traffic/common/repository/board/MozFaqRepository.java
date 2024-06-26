package com.moz.ates.traffic.common.repository.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.board.MozFaq;

@Mapper
public interface MozFaqRepository {
	
	public void deleteFaq(String faqIdx);

    /**
     * @brief : FAQ 리스트 조회
     * @details : FAQ 리스트 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : faqIdx
     * @return : 
     */
	public List<MozFaq> findAllMozFaq(MozFaq faq);

    /**
     * @brief : FAQ 리스트 개수 조회
     * @details : FAQ 리스트 개수 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : faqIdx
     * @return : 
     */
	public int countMozFaq(MozFaq faq);

    /**
     * @brief : FAQ 상세 조회
     * @details : FAQ 상세 조회
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : faqIdx
     * @return : 
     */
	public MozFaq findOneMozFaq(String faqIdx);

    /**
     * @brief : FAQ 저장
     * @details : FAQ 저장
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : faqIdx
     * @return : 
     */
	public void saveMozFaq(MozFaq faq);

    /**
     * @brief : FAQ 수정
     * @details : FAQ 수정
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : faqIdx
     * @return : 
     */
	public void updateMozFaq(MozFaq faq);

    /**
     * @brief : FAQ 삭제
     * @details : FAQ 삭제
     * @author : KC.KIM
     * @date : 2023.08.04
     * @param : faqIdx
     * @return : 
     */
	public void deleteMozFaq(String faqIdx);
	
	
// ************************* for PORTAL start
	
	/**
	  * @Method Name : findAllByDelYn
	  * @Date : 2024. 2. 21.
	  * @Author : IK.MOON
	  * @Method Brief : FAQ 리스트 조회
	  * @param mozFaq
	  * @return
	  */
	public List<MozFaq> findAllByDelYn(MozFaq mozFaq);
	
	/**
	  * @Method Name : countAllBtDelYn
	  * @Date : 2024. 2. 21.
	  * @Author : IK.MOON
	  * @Method Brief : FAQ 리스트 개수 조회
	  * @param mozFaq
	  * @return
	  */
	public int countAllBtDelYn(MozFaq mozFaq);

	/**
	  * @Method Name : findOneByDelYnAndFaqIdx
	  * @Date : 2024. 2. 23.
	  * @Author : IK.MOON
	  * @Method Brief : FAQ 상세 조회
	  * @param mozFaq
	  * @return
	  */
	public MozFaq findOneByDelYnAndFaqIdx(MozFaq mozFaq);
	
	/**
	  * @Method Name : updateViewCnt
	  * @Date : 2024. 2. 23.
	  * @Author : IK.MOON
	  * @Method Brief : FAQ 조회수 증가
	  * @param mozFaq
	  */
	public void updateViewCnt(MozFaq mozFaq);
//************************* for PORTAL end
	
}
