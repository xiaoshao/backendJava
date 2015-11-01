package com.xiaoshao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Controller
public class EmitExeptionController {

    @RequestMapping("/emitError2")
    public void emitError() throws Exception{
        throw new NotImplementedException();
    }
}
