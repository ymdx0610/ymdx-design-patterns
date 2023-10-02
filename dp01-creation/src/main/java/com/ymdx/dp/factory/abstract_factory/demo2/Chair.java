package com.ymdx.dp.factory.abstract_factory.demo2;

/**
 * @ClassName: Chair
 * @Description: 座椅
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-27 10:52
 * @Version: 1.0
 **/
public interface Chair {

    void feature();

}

class ChairA implements Chair{

    @Override
    public void feature() {
        System.out.println("座椅可以自动加热！");
    }

}

class ChairB implements Chair{

    @Override
    public void feature() {
        System.out.println("座椅不能加热！");
    }

}
