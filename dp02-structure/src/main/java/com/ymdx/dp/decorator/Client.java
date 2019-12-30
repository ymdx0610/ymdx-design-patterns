package com.ymdx.dp.decorator;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-30 10:45
 * @Version: 1.0.1
 **/
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 进行装饰
        component.operation();
    }

}
