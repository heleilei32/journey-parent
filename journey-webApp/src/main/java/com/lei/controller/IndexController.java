package com.lei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by lenovo on 2017/9/27.
 */
@Controller
public class IndexController {


    @RequestMapping("/aaaa")
    public String toIndex(){
        System.out.println("aaaaaa");

        return "newIndex";
    }

}
