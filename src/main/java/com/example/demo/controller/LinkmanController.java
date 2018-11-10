package com.example.demo.controller;

import com.example.demo.mapper.LinkmanMapper;
import com.example.demo.pojo.Linkman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LinkmanController {
    @Autowired
    private LinkmanMapper linkmanMapper;

    @RequestMapping(value = "linkman",method = RequestMethod.POST)
    @ResponseBody
    public String addlm(Linkman linkman){
        System.out.print("ok");
        System.out.print(linkman);
        int i = linkmanMapper.addLinkMan(linkman);
        if(i>0)
            return "SUCCESS";
        else
            return  "ERROR";
    }
}
