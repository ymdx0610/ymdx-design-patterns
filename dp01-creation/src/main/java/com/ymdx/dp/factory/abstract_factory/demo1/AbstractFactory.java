package com.ymdx.dp.factory.abstract_factory.demo1;

/**
 * @ClassName: AbstractFactory
 * @Description: 抽象工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 13:46
 * @Version: 1.0.1
 **/
public interface AbstractFactory {

    // 创建产品A
    public ProductA factoryA();
    // 创建产品B
    public ProductB factoryB();

}
