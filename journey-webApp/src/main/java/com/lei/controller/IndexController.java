package com.lei.controller;

import com.lei.service.FormulaService;
import com.lei.service.Quartz.MyJob;
import com.lei.service.Quartz.QuartzManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by lenovo on 2017/9/27.
 */
@Controller
public class IndexController {
    private static Logger logger = Logger.getLogger(IndexController.class);

    @Autowired
    FormulaService formulaService;

    @RequestMapping("/aaaa")
    public String toIndex(){
        return "newIndex";
    }

}
