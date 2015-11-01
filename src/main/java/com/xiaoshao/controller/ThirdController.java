package com.xiaoshao.controller;

import com.xiaoshao.entity.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.PrintWriter;
import java.util.Map;

@Controller
public class ThirdController {
    @RequestMapping("/front")
    public String passToFrontEnd(Map<String, Object> map){
        ResponseEntity responseEntity = new ResponseEntity();

        responseEntity.setFirst("first1");
        responseEntity.setSecond("second1");

        map.put("response", responseEntity);
        return "front";
    }

    @RequestMapping("/ajax")
    public void pass4Ajax(PrintWriter pw){
        pw.write("hello world");
    }

    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:ajax";
    }
}
