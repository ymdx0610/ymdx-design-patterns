package com.ymdx.dp.observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Button
 * @Description: 按钮控件
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 16:30
 * @Version: 1.0.1
 **/
public class Button implements Clickable {

    List<ClickableObserver> observers = new ArrayList<>();

    // 按钮信息
    // 颜色
    String color;
    // 坐标
    int x, y;


    @Override
    public void click() {
        System.out.println("按钮被单击");
        // 执行所有观察者的事件处理方法
        for(int i = observers.size() - 1; i >= 0; i--){
            observers.get(i).clicked(this);
        }
    }

    @Override
    public void addClickableObserver(ClickableObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeClickableObserver(ClickableObserver observer) {
        observers.remove(observer);
    }

    @Override
    public String toString() {
        return "按钮颜色：" + color + "，坐标：" + x + "," + y;
    }

}
