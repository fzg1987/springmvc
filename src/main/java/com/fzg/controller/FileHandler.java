package com.fzg.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/file")
public class FileHandler {

    @RequestMapping("/upload")
    public String upload(@RequestParam("img") MultipartFile img, HttpServletRequest request){
        if(!img.isEmpty()){
            String path = request.getSession().getServletContext().getRealPath("file");
            String fileName = img.getOriginalFilename();
            File file = new File(path,fileName);
            try {
                img.transferTo(file);
                request.setAttribute("src","/file/"+fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "upload";
    }
    @PostMapping("/uploads")
    public String uploads(@RequestParam("imgs") MultipartFile[] imgs, HttpServletRequest request){
        List<String> pathList = new ArrayList<>();
        for (MultipartFile img : imgs) {
            if(img.getSize() > 0){
                String path = request.getSession().getServletContext().getRealPath("file");
                String fileName = img.getOriginalFilename();
                File file = new File(path,fileName);
                try {
                    img.transferTo(file);
                    pathList.add("/file/"+fileName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        request.setAttribute("list",pathList);
        return "uploads";
    }
    @GetMapping("/download")
    public void download(String fileName, HttpServletRequest request, HttpServletResponse response){
        if(fileName != null){
            String path = request.getSession().getServletContext().getRealPath("file");
            File file = new File(path,fileName);
            OutputStream outputStream = null;
            if(file.exists()){
                // ??????????????????
                response.setContentType("application/force-download");
                // ???????????????
                response.setHeader("Context-Disposition","attachment;filename="+fileName);
                try {
                    outputStream = response.getOutputStream();
                    outputStream.write(FileUtils.readFileToByteArray(file));
                    outputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if(outputStream != null){
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
