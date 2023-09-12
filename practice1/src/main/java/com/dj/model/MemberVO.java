package com.dj.model;

import java.sql.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
//DTO,VO,Bean은 비슷한 의미를 가진다.
public class MemberVO {
	private String memberId; //회원아이디
	private String memberName; //회원이름
	private String boardTitle; //글제목
	private String boardContents; //글내용
	private int boardHits; //조회수
	private Date boardCreatedTime; //작성일자
	private Date boardUpdatedTime; //수정일자
}
