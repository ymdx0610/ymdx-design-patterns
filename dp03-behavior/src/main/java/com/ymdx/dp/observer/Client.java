package com.ymdx.dp.observer;

/**
 * @ClassName: Client
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 16:14
 * @Version: 1.0.1
 **/
public class Client {

    public static void main(String[] args) {
        // 创建一个主题对象（被观察者）
        ConcreteSubject subject = new ConcreteSubject();
        // 创建一个观察者
        Observer observer = new ConcreteObserver();
        // 登记观察者
        subject.attach(observer);
        // 改变状态
        subject.change();
    }

}
