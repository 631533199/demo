package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterController {
    @RequestMapping("router")
    public String router(String path,String fileName){
        return path+"/"+fileName;
    }
}
