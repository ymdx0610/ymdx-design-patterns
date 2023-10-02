package com.ymdx.dp.factory.abstract_factory.demo1;


/**
 * @ClassName: AbstractFactoryDemo
 * @Description: 应用测试
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 14:05
 * @Version: 1.0.1
 **/
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        // 定义两个工厂
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();
        // 生产等级为1的产品A
        ProductA a1 = factory1.factoryA();
        // 生产等级为1的产品B
        ProductB b1 = factory1.factoryB();
        // 生产等级为2的产品A
        ProductA a2 = factory2.factoryA();
        // 生产等级为2的产品B
        ProductB b2 = factory2.factoryB();

        // 业务处理
        a1.method1();
        a2.method1();
        b1.method1();
        b2.method1();

    }

}
