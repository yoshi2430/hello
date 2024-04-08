package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // @Controllerアノテーションを追加
public class HelloWorld {
    @RequestMapping("/hello")
    public String start() {
        return "HelloWorld.html";
    }
}
