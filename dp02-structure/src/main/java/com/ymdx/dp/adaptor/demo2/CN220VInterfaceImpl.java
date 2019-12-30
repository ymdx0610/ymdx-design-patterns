package com.ymdx.dp.adaptor.demo2;

/**
 * @ClassName: CN220VInterfaceImpl
 * @Description: 中国220V电源接口实现
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 11:33
 * @Version: 1.0
 **/
public class CN220VInterfaceImpl implements CN220VInterface {
    @Override
    public void connect() {
        System.out.println("中国220V，接通电源，开始工作...");
    }
}
