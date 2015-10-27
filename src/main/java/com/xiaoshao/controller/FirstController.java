package com.xiaoshao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @RequestMapping("authorName")
    public String getAuthorName() {
        System.out.println("This is first controller");
        return "greeting";
    }
}
