package com.zth.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zth
 * @Date 2019-07-26 23:08
 */
@RestController
public class FileUpload {

    @RequestMapping("/fileUpload")
    @ResponseBody
    public Map<String,Object> fileUpload(MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("g:/"+file.getOriginalFilename()));
        Map<String,Object> map = new HashMap<>();
        map.put("msg","OK");
        return map;
    }
}
