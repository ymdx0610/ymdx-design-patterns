package com.ymdx.dp.bridge;

/**
 * @ClassName: Abstraction
 * @Description: 抽象化角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 10:39
 * @Version: 1.0.1
 **/
public abstract class Abstraction {

    // 定义对实现化角色的引用
    private Implementor impl;

    public Abstraction(Implementor impl){
        this.impl = impl;
    }

    // 业务方法
    public void operation(){
        this.impl.operationImpl();
    }

}
