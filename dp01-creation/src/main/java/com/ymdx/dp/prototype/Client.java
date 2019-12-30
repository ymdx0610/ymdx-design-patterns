package com.ymdx.dp.prototype;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 16:59
 * @Version: 1.0.1
 **/
public class Client {

    public void operation(Prototype example){
        // 得到example的副本
        Prototype p = example.clone();
    }

}
