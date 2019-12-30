package com.ymdx.dp.adaptor.demo2;

/**
 * @ClassName: JP110VInterfaceImpl
 * @Description: 日本110V电源接口实现
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 11:32
 * @Version: 1.0
 **/
public class JP110VInterfaceImpl implements JP110VInterface{
    @Override
    public void connect() {
        System.out.println("日本110V，接通电源，开始工作...");
    }
}
