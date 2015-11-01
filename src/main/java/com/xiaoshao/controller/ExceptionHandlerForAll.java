package com.xiaoshao.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.PrintWriter;

@ControllerAdvice
public class ExceptionHandlerForAll {

    @ExceptionHandler
    public void handlerAllException(Exception ex, PrintWriter printWriter){
        printWriter.write("Handle all exception..");
        printWriter.write(ex.getMessage());
        printWriter.flush();
    }
}
