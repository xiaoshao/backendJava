package com.xiaoshao.service;

import org.springframework.stereotype.Component;

/**
 * Created by zwshao on 11/2/15.
 */
@Component("firstService")
public class FirstService {
    public String getRecord(){
        return "the service from record";
    }
}
