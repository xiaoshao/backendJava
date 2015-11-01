package com.xiaoshao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.PrintWriter;

/**
 * Created by zwshao on 11/1/15.
 */
@Controller
public class UploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void upload(@RequestParam("file") MultipartFile file, PrintWriter printWriter) {
        printWriter.write("file : " + file.getOriginalFilename());
//        MultipartHttpServletRequest servletRequest = (MultipartHttpServletRequest)httpServletRequest;
//        MultipartFile file = servletRequest.getFile("file");
//        String fileName = file.getOriginalFilename();
//
//        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
//        try {
//            FileOutputStream fos = new FileOutputStream(httpServletRequest.getSession().
//                    getServletContext().getRealPath("/") + "/upload/" +df.format(new Date()) +fileName.substring(fileName.lastIndexOf(".")));
//            fos.write(file.getBytes());
//            fos.flush();
//            fos.close();
//            printWriter.write("success upload" + fos.getFD());
//        } catch (Exception e) {
//            e.printStackTrace();
//
//            printWriter.write("eoor" + e.toString());
//        }
    }
}
