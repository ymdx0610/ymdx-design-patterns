package com.ymdx.dp.simple_factory;

/**
 * @ClassName: Main
 * @Description: 简单工厂模式测试主方法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 15:39
 * @Version: 1.0
 **/
public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car byd = carFactory.createCar("Byd");
        byd.run();

        Car jiLi = carFactory.createCar("JiLi");
        jiLi.run();
    }

}
