package com.dj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dj.model.MemberVO;

@Mapper
public interface Practice {
	public List<MemberVO> selectList();
}