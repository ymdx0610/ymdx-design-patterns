package com.ymdx.dp.state.demo1;

/**
 * @ClassName: CCTV2
 * @Description: 具体频道
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 09:54
 * @Version: 1.0.1
 **/
public class CCTV2 implements Channel{
    @Override
    public void display() {
        System.out.println("CCTV2 经济半小时");
    }
}
