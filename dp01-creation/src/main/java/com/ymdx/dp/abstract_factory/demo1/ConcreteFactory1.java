package com.ymdx.dp.abstract_factory.demo1;

/**
 * @ClassName: ConcreteFactory1
 * @Description: 具体工厂1
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 13:59
 * @Version: 1.0.1
 **/
public class ConcreteFactory1 implements AbstractFactory {

    // 创建等级为1的产品A
    @Override
    public ProductA factoryA() {
        return new ProductA1();
    }

    // 创建等级为1的产品B
    @Override
    public ProductB factoryB() {
        return new ProductB1();
    }

}
