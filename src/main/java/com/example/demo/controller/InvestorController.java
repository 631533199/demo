package com.example.demo.controller;

import com.example.demo.mapper.InvestorMapper;
import com.example.demo.pojo.Investor;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InvestorController {
    @Autowired
    private InvestorMapper investorMapper;

    @RequestMapping(value = "investor")
    public Investor getInvestor(){
        Investor investor = investorMapper.find(1001);
        System.err.print(investor);
        return investor;
    }
    @RequestMapping(value = "investor",method = RequestMethod.POST)
    @ResponseBody
    public String addInvestor(Investor investor){
        System.out.print(investor);
        int i =investorMapper.add(investor);
        if(i>0)
            return "SUCCESS";
        else
            return "ERROR";
//        return "SUCCESS";
    }
}
