package com.ymdx.dp.bridge;

/**
 * @ClassName: Client
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 10:43
 * @Version: 1.0.1
 **/
public class Client {

    public static void main(String[] args) {
        // 定义一个实现化角色
        Implementor impl = new ConcreteImplementor();
        // 定义一个抽象化角色
        Abstraction abs = new RefinedAbstraction(impl);
        // 执行
        abs.operation();
    }

}
