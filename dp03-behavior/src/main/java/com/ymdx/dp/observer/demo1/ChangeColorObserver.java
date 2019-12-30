package com.ymdx.dp.observer.demo1;

/**
 * @ClassName: ChangeColorObserver
 * @Description: 修改按钮颜色的观察者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 16:35
 * @Version: 1.0.1
 **/
public class ChangeColorObserver implements ClickableObserver {

    @Override
    public void clicked(Clickable clickable) {
        Button b = (Button) clickable;
        b.color = "红色";
    }

}
