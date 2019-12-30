package com.ymdx.dp.decorator.demo1;

/**
 * @ClassName: ClientDemo
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-30 14:04
 * @Version: 1.0.1
 **/
public class ClientDemo {

    public static void main(String[] args) {
        Car car = new Benz();
        // 对奔驰车进行装饰
        CarDecorator cd = new ConcreteCarDecorator(car);
        cd.show();
    }

}
