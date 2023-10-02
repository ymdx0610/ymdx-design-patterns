package com.ymdx.dp.factory.factory_method.demo2;

import com.ymdx.dp.factory.simple_factory.Car;

/**
 * @ClassName: CarFactory
 * @Description: 汽车工厂接口
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 15:35
 * @Version: 1.0
 **/
public interface CarFactory {

    Car createCar(String name);

}
