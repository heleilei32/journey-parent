package com.lei.service.Quartz;


import com.lei.dao.FormulaRepository;
import com.lei.pojo.Formula;
import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

public class MyJob implements Job{
    public final Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    FormulaRepository formulaRepository;


    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info(123123123);
        Formula formula = new Formula();
        formula.setProductId(123456);
        formulaRepository.save(formula);
    }
}