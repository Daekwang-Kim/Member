package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.test.Service.CrawlingService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrawlingTest {

	@Autowired
	CrawlingService crawlingService;

	@Test
	void sendTelegram() {
		crawlingService.sendTelegram();
	}

}
