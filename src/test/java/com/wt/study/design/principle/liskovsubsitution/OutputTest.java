package com.wt.study.design.principle.liskovsubsitution;

import com.wt.study.BaseTest;
import com.wt.study.design.principle.liskovsubsitution.methodout.Child;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.liskovsubsitution
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/3 10:03 PM
 * @Version: v1.0
 */
public class OutputTest extends BaseTest{
    @org.junit.Test
    public void test(){
        Child child = new Child();
        System.out.println(child.method());
    }
}
