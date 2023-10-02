package com.ymdx.dp.factory.abstract_factory.demo1;

/**
 * @ClassName: ProductA1
 * @Description: 产品A的具体产品ProductA1
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 13:49
 * @Version: 1.0.1
 **/
public class ProductA1 implements ProductA {
    @Override
    public void method1() {
        System.out.println("等级为1的产品A的实现方法");
    }

    @Override
    public void method2() {
        // 业务逻辑处理代码...
    }
}
