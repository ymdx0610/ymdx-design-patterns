package com.ymdx.dp.factory.abstract_factory.demo1;

/**
 * @ClassName: ConcreteFactory2
 * @Description: 具体工厂2
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 14:03
 * @Version: 1.0.1
 **/
public class ConcreteFactory2 implements AbstractFactory {

    // 创建等级为2的产品A
    @Override
    public ProductA factoryA() {
        return new ProductA2();
    }

    // 创建等级为2的产品B
    @Override
    public ProductB factoryB() {
        return new ProductB2();
    }

}
