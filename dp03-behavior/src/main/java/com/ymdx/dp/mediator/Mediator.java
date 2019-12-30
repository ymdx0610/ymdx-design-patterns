package com.ymdx.dp.mediator;

/**
 * @ClassName: Mediator
 * @Description: 抽象中介者角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 15:05
 * @Version: 1.0.1
 **/
public abstract class Mediator {

    // 中介者模式的业务逻辑方法
    public abstract void colleagueChanged(Colleague c);

}
