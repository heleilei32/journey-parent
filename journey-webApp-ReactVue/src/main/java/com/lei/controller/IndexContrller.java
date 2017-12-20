package com.lei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexContrller {

    @RequestMapping("/index")
    public String toIndex(){
        System.out.printf("index");
        return "index";
    }

}
