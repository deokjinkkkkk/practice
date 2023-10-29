package com.dj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dj.model.BoardVO;


public interface PracticeService {
	public List<BoardVO> selectList();
}
