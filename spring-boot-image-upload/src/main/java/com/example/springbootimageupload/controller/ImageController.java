package com.example.springbootimageupload.controller;

import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-11-27
 * Time: 1:07
 */

@RestController
@RequestMapping("/image")
public class ImageController {
    // 上传文件
    @RequestMapping("/upload")
    public HashMap<String, Object> upload(@RequestPart("imageFile") MultipartFile file) throws IOException {
        String path = "C:\\users\\liaoyueyue\\desktop\\";
        String fileName = UUID.randomUUID().toString().replace("-", "") + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String pathAbsolute = path + fileName;
        String pathRelative = "/upload/" + fileName;
        file.transferTo(new File(pathAbsolute));
        HashMap<String, Object> result = new HashMap<>();
        result.put("path", "文件已经保存至：" + path);
        result.put("imagePath", pathRelative);
        return result;
    }
}
