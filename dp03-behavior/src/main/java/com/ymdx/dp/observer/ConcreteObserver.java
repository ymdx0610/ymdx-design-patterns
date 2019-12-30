package com.ymdx.dp.observer;

/**
 * @ClassName: ConcreteObserver
 * @Description: 具体观察者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 16:12
 * @Version: 1.0.1
 **/
public class ConcreteObserver implements Observer {

    // 实现更新方法
    @Override
    public void update() {
        System.out.println("收到通知，并进行处理！");
    }

}
