package com.wt.study.design.principle.dependenceinversion;




/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.dependenceinversion
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/20 9:03 PM
 * @Version: v1.0
 */
public class JavaCource implements Course {
    @Override
    public void studyCourse() {
        System.out.println("学习java课程");
    }
}
