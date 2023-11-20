package com.dj.mapper;

import java.util.List;

import com.dj.model.BoardVO;


public interface PracticeMapper {
	public List<BoardVO> selectList();
	public int BoardInsert(BoardVO vo);
}
