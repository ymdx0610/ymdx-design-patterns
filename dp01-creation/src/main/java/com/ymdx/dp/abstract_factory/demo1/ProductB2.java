package com.ymdx.dp.abstract_factory.demo1;

/**
 * @ClassName: ProductB2
 * @Description: 产品A的具体产品ProductB2
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 13:55
 * @Version: 1.0.1
 **/
public class ProductB2 implements ProductB {

    @Override
    public void method1() {
        System.out.println("等级为2的产品B的实现方法");
    }

    @Override
    public void method2() {
        // 业务逻辑处理代码...
    }

}
