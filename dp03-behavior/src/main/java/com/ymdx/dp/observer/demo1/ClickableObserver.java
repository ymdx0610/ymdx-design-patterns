package com.ymdx.dp.observer.demo1;

/**
 * @ClassName: ClickableObserver
 * @Description: 可单击控件的单击事件观察者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 16:27
 * @Version: 1.0.1
 **/
public interface ClickableObserver {

    // 发生单击事件时的操作
    void clicked(Clickable clickable);

}
