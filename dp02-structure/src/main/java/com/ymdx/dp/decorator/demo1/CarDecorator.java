package com.ymdx.dp.decorator.demo1;

/**
 * @ClassName: CarDecorator
 * @Description: 汽车的装饰者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-30 13:56
 * @Version: 1.0.1
 **/
public abstract class CarDecorator implements Car {

    private Car car = null;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void show() {
        this.car.show();
    }

}
