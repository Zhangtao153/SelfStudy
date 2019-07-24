package com.zth.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author zth
 * @Date 2019-07-24 22:40
 */
@Controller
public class Download {

    @RequestMapping("download")
    public void download(String fileName,HttpServletResponse response, HttpServletRequest httpServletRequest) throws IOException {
        // 设置响应头
        System.out.println(fileName);
        response.setHeader("Content-Disposition","attachment;filename="+fileName);
        OutputStream outputStream = response.getOutputStream();
        String path = httpServletRequest.getServletContext().getRealPath("img");
        System.out.println(path);
        File file = new File(path,fileName);
        byte[] bytes = FileUtils.readFileToByteArray(file);
        outputStream.write(bytes);
        outputStream.close();
    }
}
