package com.ymdx.dp.observer.demo1;

/**
 * @ClassName: ChangeCoordinateObserver
 * @Description: 修改按钮坐标的观察者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 16:36
 * @Version: 1.0.1
 **/
public class ChangeCoordinateObserver implements ClickableObserver {

    @Override
    public void clicked(Clickable clickable) {
        Button b = (Button) clickable;
        b.x = 100;
        b.y = 90;
    }

}
