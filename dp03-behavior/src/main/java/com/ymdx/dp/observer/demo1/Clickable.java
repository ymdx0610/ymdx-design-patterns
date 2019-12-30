package com.ymdx.dp.observer.demo1;

/**
 * @ClassName: Clickable
 * @Description: 可单击控件的抽象接口
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 16:23
 * @Version: 1.0.1
 **/
public interface Clickable {

    // 单击
    void click();

    // 添加单击事件的观察者
    void addClickableObserver(ClickableObserver observer);

    // 移除单击事件的观察者
    void removeClickableObserver(ClickableObserver observer);

}
