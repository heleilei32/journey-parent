package com.lei.controller;

import com.lei.service.FormulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by lenovo on 2017/9/27.
 */
@Controller
public class IndexController {

    @Autowired
    FormulaService formulaService;

    @RequestMapping("/aaaa")
    public String toIndex(){
        System.out.println("aaaaaa");
        formulaService.save();
        return "newIndex";
    }

}
