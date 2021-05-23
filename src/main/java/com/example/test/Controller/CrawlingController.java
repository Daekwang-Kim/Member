package com.example.test.Controller;

import com.example.test.Service.CrawlingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("crawler")
public class CrawlingController {

    @Autowired
    CrawlingService crawlingService;

    @Scheduled(fixedDelay = 600000)
    public void sendTelegram() {
        crawlingService.sendTelegram();
    }
}
