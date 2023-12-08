package com.moz.ates.traffic.common.repository.operator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.moz.ates.traffic.common.entity.operator.MozAuth;

@Mapper
public interface MozAuthRepository {

	public void insert(MozAuth mozAuth);

	public List<MozAuth> findAllMozAuth(MozAuth mozAuth);
}
