package com.xiaoshao.controller;

import com.xiaoshao.entity.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FirstController {
    @ResponseBody
    @RequestMapping("authorName")
    public ResponseEntity getAuthorName() {
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setFirst("fir");
        responseEntity.setSecond("sec");
        return responseEntity;
    }

    @ResponseBody
    @RequestMapping("/search")
    public List<ResponseEntity> getResponseEntities(){
        List<ResponseEntity> responseEntities = new ArrayList<ResponseEntity>();

        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setFirst("first1");
        responseEntity.setSecond("second1");

        responseEntities.add(responseEntity);

        responseEntity = new ResponseEntity();
        responseEntity.setFirst("first1");
        responseEntity.setSecond("second1");

        responseEntities.add(responseEntity);

        return responseEntities;
    }

}
