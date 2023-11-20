package com.dj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.mapper.PracticeMapper;
import com.dj.model.BoardVO;
@Service
public class PracticeServiceImpl implements PracticeService {
	
	@Autowired
	private PracticeMapper practice;
	@Override
	public List<BoardVO> selectList() {
		// TODO Auto-generated method stub
		return practice.selectList();
	}
	@Override
	public int BoardInsert(BoardVO vo) {
		// TODO Auto-generated method stub
		return practice.BoardInsert(vo);
	}

}
