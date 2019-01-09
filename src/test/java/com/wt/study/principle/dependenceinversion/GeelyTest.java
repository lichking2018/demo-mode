package com.wt.study.principle.dependenceinversion;

import com.wt.study.principle.BaseTest;
import org.junit.Test;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.dependenceinversion
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/20 9:25 PM
 * @Version: v1.0
 */
public class GeelyTest extends BaseTest {
    @Test
    public void test1(){
        Geely geely = new Geely();
        geely.studyImoocCourse(new JavaCource());
        geely.studyImoocCourse(new FECourse());
    }


}
