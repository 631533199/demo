package com.example.demo.controller;

import com.example.demo.mapper.InvestorMapper;
import com.example.demo.pojo.Investor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
