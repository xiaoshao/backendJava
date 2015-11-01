package com.xiaoshao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.PrintWriter;

/**
 * Created by zwshao on 11/1/15.
 */
@Controller
public class ParticalExceptionController {

    @RequestMapping("/emitError")
    public void emitException(PrintWriter printWriter) {
        int value = 10 / 0;
        printWriter.write(value);
        printWriter.flush();
    }

    @ExceptionHandler
    public void exceptionHandler(Exception ex, PrintWriter printWriter){
        printWriter.write("handled exception :");
        printWriter.write(ex.getMessage());
        printWriter.flush();
    }
}
