package com.moz.ates.traffic.common.repository.police;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.police.MozPolInfo;

@Mapper
public interface MozPolInfoRepository {
	
	public List<MozPolInfo> selectPolInfoList(MozPolInfo polInfo);
	
	public int selectPolInfoListCnt(MozPolInfo polInfo);
	
	public MozPolInfo selectPoliceInfo(MozPolInfo polInfo);
	
	public MozPolInfo selectPoliceInfoByPoliceId(String appPolId);

	public MozPolInfo selectPolInfoDetail(String polLcenId);

    /**
   * @brief : 사용자 리스트 조회
   * @details : 사용자 리스트 조회
   * @author : KC.KIM
   * @date : 2023.08.18
   * @param : polInfo
   * @return : 
   */
	public List<MozPolInfo> findAllMozPolInfo(MozPolInfo polInfo);

    /**
   * @brief : 사용자 리스트 개수 조회
   * @details : 사용자 리스트 개수 조회
   * @author : KC.KIM
   * @date : 2023.08.18
   * @param : polInfo
   * @return : 
   */
	public int countMozPolInfo(MozPolInfo polInfo);

    /**
     * @brief : 사용자 상세 조회
     * @details : 사용자 상세 조회
     * @author : KC.KIM
     * @date : 2023.08.18
     * @param : oprtrId
     * @return : 
     */
	public MozPolInfo findOneMozPolInfo(String polLcenId);
}
