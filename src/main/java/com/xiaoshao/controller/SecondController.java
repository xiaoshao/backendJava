package com.xiaoshao.controller;

import com.xiaoshao.entity.RequestEntity;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zwshao on 10/31/15.
 */
@Controller
public class SecondController {

    @RequestMapping("/views/{id}")
    public String modelView(@PathVariable("id") String id){
        System.out.println("id : " + id);
        return "greeting";
    }

    //autoMapping?name=xiaoshao&age=11
    @ResponseBody
    @RequestMapping("/autoMapping")
    public Map<String, String> autoMapping(String name, int age) {
        System.out.println(name + " " + age);

        Map<String, String> map = new HashMap<String, String>();

        map.put("name", name);
        map.put("age", String.valueOf(age));
        return map;
    }

    //autobox?id=123&name=xiaoshao&age=15
    @ResponseBody
    @RequestMapping("/autobox")
    public Map<String, String> autoBox(RequestEntity requestEntity){
        Map<String, String> map = new HashMap<String, String>();

        map.put("id", requestEntity.getId());
        map.put("name", requestEntity.getName());
        map.put("age", requestEntity.getAge());

        return map;
    }

    //date?date=19851029
    @ResponseBody
    @RequestMapping("/date")
    public Map<String, String> autoDate(Date date){
        Map<String, String> map = new HashMap<String, String>();

        map.put("date", date.toString());

        return map;
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyymmdd"), true));
    }
}
