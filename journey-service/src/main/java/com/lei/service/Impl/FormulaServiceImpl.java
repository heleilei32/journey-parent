package com.lei.service.Impl;

import com.lei.dao.FormulaRepository;
import com.lei.pojo.Formula;
import com.lei.service.FormulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Lei on 2017/9/29.
 */
@Service
public class FormulaServiceImpl implements FormulaService{

    @Autowired
    FormulaRepository formulaRepository;

    public void save (){
        Formula formula = new Formula();
        formula.setType(1);
        formula.setFormula("123");
        formula.setValue("123456");
        formulaRepository.save(formula);
    }
}
