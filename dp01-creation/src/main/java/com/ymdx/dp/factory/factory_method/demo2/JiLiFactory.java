package com.ymdx.dp.factory.factory_method.demo2;

import com.ymdx.dp.factory.simple_factory.Car;
import com.ymdx.dp.factory.simple_factory.JiLi;

/**
 * @ClassName: JiLiFactory
 * @Description: 吉利汽车工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 16:48
 * @Version: 1.0
 **/
public class JiLiFactory implements CarFactory {
    @Override
    public Car createCar(String name) {
        return new JiLi();
    }
}
