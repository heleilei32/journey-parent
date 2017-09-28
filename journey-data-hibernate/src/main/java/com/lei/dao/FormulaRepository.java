package com.lei.dao;

import com.lei.pojo.Formula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Lei on 2017/9/29.
 */
@Repository
public interface FormulaRepository extends JpaRepository<Formula,Integer>{
}
