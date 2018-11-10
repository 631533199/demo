package com.example.demo.controller;

import com.example.demo.mapper.AdmMapper;
import com.example.demo.pojo.Adm;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdmController {
    @Autowired
    private AdmMapper admMapper;
    @RequestMapping(value = "adm",method = RequestMethod.GET)
    @ResponseBody
    public String search(String admPhone){
        Adm adm = admMapper.search(admPhone);
        if(null==adm)
            return "ERROR";
        else
            return adm.getAdmName();
    }
}
