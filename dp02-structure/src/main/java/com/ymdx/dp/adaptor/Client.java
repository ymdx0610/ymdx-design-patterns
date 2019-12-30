package com.ymdx.dp.adaptor;

/**
 * @ClassName: Client
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-30 14:15
 * @Version: 1.0.1
 **/
public class Client {

    public static void main(String[] args) {
        // 适配器模式应用
        Target target = new Adapter();
        target.request();
    }

}
