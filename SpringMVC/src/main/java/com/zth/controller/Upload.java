package com.zth.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author zth
 * @Date 2019-07-25 0:05
 */
@Controller
public class Upload {
    @RequestMapping("upload")
    public String upload(MultipartFile file, String name, HttpServletRequest request) throws IOException {
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        File file1 = new File(request.getServletContext().getRealPath("ups")+"/"+uuid+suffix);
        System.out.println(file1.toString());
        FileUtils.copyInputStreamToFile(file.getInputStream(),file1);
        return "hello";
    }
}
