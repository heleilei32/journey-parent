package com.lei.controller;

import com.lei.service.FormulaService;
import com.lei.service.Utils.MyJob;
import com.lei.service.Utils.QuartzManager;
import org.apache.log4j.Logger;
import org.quartz.Job;
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

    @Autowired
    QuartzManager quartzManager;

    public static String JOB_NAME = "动态任务调度";
    public static String TRIGGER_NAME = "动态任务触发器";
    public static String JOB_GROUP_NAME = "XLXXCC_JOB_GROUP";
    public static String TRIGGER_GROUP_NAME = "XLXXCC_JOB_GROUP";

    @RequestMapping("/aaaa")
    public String toIndex(){




        try {
            System.out.println("【系统启动】开始(每1秒输出一次)...");
            //quartzManager.addJob(MyJob.class,JOB_NAME, JOB_GROUP_NAME, 3,5);


            quartzManager.addJob(MyJob.class, JOB_NAME,JOB_GROUP_NAME,"0/1 * * * * ?");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "newIndex";
    }

}
