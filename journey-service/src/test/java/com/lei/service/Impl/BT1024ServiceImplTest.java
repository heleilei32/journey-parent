package com.lei.service.Impl;

import junit.framework.TestCase;

/**
 * Created by Lei on 2017/11/25.
 */
public class BT1024ServiceImplTest extends TestCase {
    public void testGetBt() throws Exception {

        BT1024ServiceImpl bt1024Service = new BT1024ServiceImpl();
        for (int i = 1 ; i <= 22 ; i++){
            System.out.println("开始页数:"+i);
            String bt = bt1024Service.getBt(i + "", "01.12");
            if ("1".equals(bt)){
                return;
            }
        }

    }


    public void testFile() throws Exception {
        BT1024ServiceImpl bt1024Service = new BT1024ServiceImpl();
        bt1024Service.downLoadBt(null);

    }

}