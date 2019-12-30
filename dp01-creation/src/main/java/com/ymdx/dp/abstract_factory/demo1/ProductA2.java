package com.ymdx.dp.abstract_factory.demo1;

/**
 * @ClassName: ProductA2
 * @Description: 产品A的具体产品ProductA2
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 13:51
 * @Version: 1.0.1
 **/
public class ProductA2 implements ProductA {

    @Override
    public void method1() {
        System.out.println("等级为2的产品A的实现方法");
    }

    @Override
    public void method2() {
        // 业务逻辑处理代码...
    }

}
