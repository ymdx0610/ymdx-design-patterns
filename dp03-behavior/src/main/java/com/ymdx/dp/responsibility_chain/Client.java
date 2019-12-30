package com.ymdx.dp.responsibility_chain;

/**
 * @ClassName: Client
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 11:35
 * @Version: 1.0.1
 **/
public class Client {

    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler();
        Handler h2 = new ConcreteHandler();
        h1.setSuccessor(h2);
        h1.handleRequest();
    }

}
