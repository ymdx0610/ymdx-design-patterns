package com.ymdx.dp.factory_method.demo2;

import com.ymdx.dp.simple_factory.demo1.Car;

/**
 * @ClassName: Main
 * @Description: 工厂方法模式测试主方法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 15:39
 * @Version: 1.0
 **/
public class Main {

    public static void main(String[] args) {

        Car car = new BydFactory().createCar("型号1");
        car.run();

        Car car1 = new JiLiFactory().createCar("XH-1");
        car1.run();
        Car car2 = new JiLiFactory().createCar("XH-2");
        car2.run();
    }

}
