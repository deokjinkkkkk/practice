package com.dj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dj.dao.Practice;
import com.dj.model.Member;

@RestController
public class Controller {
	
	@Autowired
	Practice practice;
	
	
	@RequestMapping("/main")
	public List<Member> main() {
		List<Member> list = practice.selectList();
		System.out.println(list);
		return list;
	}
}
