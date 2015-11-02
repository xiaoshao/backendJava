package com.xiaoshao.controller;

import com.xiaoshao.entity.ResponseEntity;
import com.xiaoshao.service.FirstService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FirstController {

    private FirstService firstService;

//    @Autowired
//    @Qualifier("firstService")
    @Resource(name = "firstService")
    public void setFirstService(FirstService firstService){
        this.firstService = firstService;
    }

//    @Autowired
//    public FirstController(FirstService firstService){
//        this.firstService = firstService;
//    }
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

    @ResponseBody
    @RequestMapping("/services")
    public Map getList(){
        Map<String, String> map = new HashMap<>();
        map.put("services", firstService.getRecord());
        return map;
    }
}
