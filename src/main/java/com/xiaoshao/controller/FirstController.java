package com.xiaoshao.controller;

import com.xiaoshao.entity.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
    @RequestMapping("authorName")
    public @ResponseBody ResponseEntity getAuthorName() {
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setFirst("fir");
        responseEntity.setSecond("sec");
        return responseEntity;
    }
}
