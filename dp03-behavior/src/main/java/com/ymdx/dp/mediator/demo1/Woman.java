package com.ymdx.dp.mediator.demo1;

/**
 * @ClassName: Woman
 * @Description: 女人类
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 15:47
 * @Version: 1.0.1
 **/
public class Woman extends Person {

    public Woman(String name, int age, int requestAge, MarriageAgency agency) {
        super(name, age, Sex.FEMALE, requestAge, agency);
    }

}
