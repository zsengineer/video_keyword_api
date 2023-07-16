package com.example.demo.controller;

import com.example.demo.service.VideoService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("/hello")
    public String getHello(){
        return "Hello World";
    }


}
