package com.ymdx.dp.simple_factory;

/**
 * @ClassName: JiLi
 * @Description: 吉利汽车
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 15:34
 * @Version: 1.0
 **/
public class JiLi implements Car {
    @Override
    public void run() {
        System.out.println("This car is JiLi.");
    }
}