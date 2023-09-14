package com.dj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dj.model.MemberVO;
import com.dj.service.PracticeService;

@org.springframework.stereotype.Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	PracticeService practice;
	
	@GetMapping("/saveForm")
	public String saveForm() {
		return "saveForm";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute MemberVO vo) {
		practice.selectList();
		return "";
	}
}