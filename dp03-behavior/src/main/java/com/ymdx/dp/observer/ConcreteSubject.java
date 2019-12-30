package com.ymdx.dp.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName: ConcreteSubject
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 16:07
 * @Version: 1.0.1
 **/
public class ConcreteSubject implements Subject {

    private Vector<Observer> obsVector = new Vector<>();

    // 登记一个新的观察者
    @Override
    public void attach(Observer obs) {
        obsVector.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        obsVector.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for(Observer obs : obsVector){
            obs.update();
        }
    }

    // 返回观察者结合的Enumeration对象
    public Enumeration<Observer> observers(){
        return obsVector.elements();
    }

    // 业务方法，改变状态
    public void change(){
        this.notifyObserver();
    }

}
