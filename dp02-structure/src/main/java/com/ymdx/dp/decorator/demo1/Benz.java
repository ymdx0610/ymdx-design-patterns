package com.ymdx.dp.decorator.demo1;

/**
 * @ClassName: Benz
 * @Description: 奔驰汽车
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-30 13:55
 * @Version: 1.0.1
 **/
public class Benz implements Car {

    @Override
    public void show() {
        System.out.println("奔驰汽车的默认颜色是黑色");
    }

}
