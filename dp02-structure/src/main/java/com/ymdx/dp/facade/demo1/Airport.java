package com.ymdx.dp.facade.demo1;

/**
 * @ClassName: Airport
 * @Description: 子系统角色：机场类
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 13:23
 * @Version: 1.0.1
 **/
public class Airport {

    public void bookTicket(String from, String to){
        System.out.println("订购了从" + from + "到" + to + "的机票");
    }

}
