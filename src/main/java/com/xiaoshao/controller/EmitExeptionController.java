package com.xiaoshao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmitExeptionController {

    @RequestMapping("/emitError2")
    public void emitError() throws Exception{
        throw new Exception("not implemented");
    }
}
