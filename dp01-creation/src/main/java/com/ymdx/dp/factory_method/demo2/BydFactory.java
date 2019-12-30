package com.ymdx.dp.factory_method.demo2;

import com.ymdx.dp.simple_factory.demo1.BydCar;
import com.ymdx.dp.simple_factory.demo1.Car;

/**
 * @ClassName: BydFactory
 * @Description: 比亚迪汽车工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 16:46
 * @Version: 1.0
 **/
public class BydFactory implements CarFactory {

    @Override
    public Car createCar(String name) {
        return new BydCar();
    }

}
