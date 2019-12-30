package com.ymdx.dp.observer;

/**
 * @ClassName: Subject
 * @Description: 抽象主题角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 16:05
 * @Version: 1.0.1
 **/
public interface Subject {

    // 登记一个新的观察者
    public void attach(Observer obs);
    // 删除一个登记过的观察者
    public void detach(Observer obs);
    // 通知所有登记过的观察者对象
    public void notifyObserver();

}
