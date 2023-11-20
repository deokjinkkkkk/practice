package com.dj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/posts")
	public String savePosts(@RequestBody BoardVO vo) {
	    // 데이터 처리 로직 (예: 데이터 저장)
	    practice.BoardInsert(vo);
	    
	     System.out.println(vo);

	    // 데이터 처리 후에는 클라이언트에게 어떠한 응답을 보낼지 결정
	    return "redirect:/list"; // 예시: "/list"로 리다이렉트
	}
	
}