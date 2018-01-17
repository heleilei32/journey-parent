package com.lei.controller;

import com.lei.service.Quartz.MyJob;
import com.lei.service.Quartz.QuartzManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class QuartzController {

    @Autowired
    QuartzManager quartzManager;

    public static String JOB_NAME = "动态任务调度";
    public static String TRIGGER_NAME = "动态任务触发器";
    public static String JOB_GROUP_NAME = "XLXXCC_JOB_GROUP";
    public static String TRIGGER_GROUP_NAME = "XLXXCC_JOB_GROUP";

    @RequestMapping("/addQuartzJob")
    @ResponseBody
    public String addQuartzJob(){
        try {
            System.out.println("【系统启动】开始(每1秒输出一次)...");
            quartzManager.addJob(MyJob.class, JOB_NAME,JOB_GROUP_NAME,"0/1 * * * * ?");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "成功";
    }
}
