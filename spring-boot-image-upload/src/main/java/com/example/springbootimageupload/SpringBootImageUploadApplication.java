package com.example.springbootimageupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootImageUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootImageUploadApplication.class, args);
        System.out.println("http://localhost:8080/test-image-upload.html");
    }

}
