package com.ymdx.dp.observer.demo1;

/**
 * @ClassName: OtherObserver
 * @Description: 其他某种业务操作的观察者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 16:38
 * @Version: 1.0.1
 **/
public class OtherObserver implements ClickableObserver {

    @Override
    public void clicked(Clickable clickable) {
        System.out.println("执行其他操作......");
    }

}
