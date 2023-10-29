package com.dj.practice1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dj.Practice1Application;
import com.dj.service.PracticeService;

@SpringBootTest(classes = Practice1Application.class)
class Practice1ApplicationTests {
	@Autowired
	private PracticeService practice;
	@Test
	void contextLoads() {
		assertNotNull(practice.selectList());
	}

}
