package com.dj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dj.dao.Practice;
import com.dj.model.Member;

public class practiceServiceImpl implements PracticeService {
	
	@Autowired
	Practice practice;
	@Override
	public List<Member> selectList() {
		// TODO Auto-generated method stub
		return practice.selectList();
	}

}
