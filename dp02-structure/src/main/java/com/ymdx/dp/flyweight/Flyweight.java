package com.ymdx.dp.flyweight;

/**
 * @ClassName: Flyweight
 * @Description: 抽象享元角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 20:02
 * @Version: 1.0.1
 **/
public interface Flyweight {

    // 业务方法
    public abstract void operation(String extrinsicState);

}
