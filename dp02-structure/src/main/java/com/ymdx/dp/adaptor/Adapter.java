package com.ymdx.dp.adaptor;

/**
 * @ClassName: Adapter
 * @Description: 适配器角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-30 14:14
 * @Version: 1.0.1
 **/
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }

}
