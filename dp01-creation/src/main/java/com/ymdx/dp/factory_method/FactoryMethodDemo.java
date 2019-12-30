package com.ymdx.dp.factory_method;

/**
 * @ClassName: FactoryMethodDemo
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 11:39
 * @Version: 1.0.1
 **/
public class FactoryMethodDemo {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factory(ConcreteProduct.class);
        // 继续业务处理...
    }

}
