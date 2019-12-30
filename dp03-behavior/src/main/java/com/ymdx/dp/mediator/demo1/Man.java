package com.ymdx.dp.mediator.demo1;

/**
 * @ClassName: Man
 * @Description: 男人类
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 15:46
 * @Version: 1.0.1
 **/
public class Man extends Person {

    public Man(String name, int age, int requestAge, MarriageAgency agency) {
        super(name, age, Sex.MALE, requestAge, agency);
    }

}
