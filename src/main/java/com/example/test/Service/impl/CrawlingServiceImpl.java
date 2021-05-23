package com.example.test.Service.impl;

import java.io.IOException;
import java.util.Date;

import com.example.test.Service.CrawlingService;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class CrawlingServiceImpl implements CrawlingService {
    
    @Override
    public void sendTelegram() {
        //품절아닌상품
        // String url = "https://www.pc-factory.co.kr/shop/product_detail.html?pd_no=118818";
        //품절상품
        String url = "https://www.pc-factory.co.kr/shop/product_detail.html?pd_no=132483";
        Document doc;
        try {
            doc = Jsoup.connect(url).get();
            doc.html();
            Elements elem = doc.select("img[src=\"/skin/shop/basic/img/btn_short.gif\"]");

            if(elem.isEmpty()) {
                String telegramUrl =
                    "https://api.telegram.org/bot1829097362:AAEXCuF4P6mwSpPVkOwkMZfmBbDj-2lvJtk/sendMessage?chat_id=1714223658&text=" + url;
                Jsoup.connect(telegramUrl).get();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            if(e.getMessage().indexOf("Must be text") > 0) {
                System.out.println("Success!!!");
            }
        }

        System.out.println(new Date());
    }
}
