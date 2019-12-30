package com.ymdx.dp.factory_method.demo2;

/**
 * @ClassName: BydCar
 * @Description: 比亚迪汽车
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 15:31
 * @Version: 1.0
 **/
public class BydCar implements Car {
    @Override
    public void run() {
        System.out.println("This car is Byd.");
    }
}
