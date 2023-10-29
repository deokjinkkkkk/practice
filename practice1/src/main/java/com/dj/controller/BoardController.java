package com.dj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dj.model.BoardVO;
import com.dj.service.PracticeService;

@RestController
@RequestMapping("/board")
public class BoardController {
	

	@Autowired
	PracticeService practice;
	
	@GetMapping("/list")
	public  List<BoardVO> saveForm() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		List<BoardVO> boardList = practice.selectList(); // PracticeService의 메서드 호출
		System.out.println("~+++++++++++++++++++++++++++++++");
        return boardList;
	}
	
}