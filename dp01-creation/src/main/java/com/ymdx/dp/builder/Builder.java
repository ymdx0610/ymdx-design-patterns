package com.ymdx.dp.builder;

/**
 * @ClassName: Builder
 * @Description: 抽象建造者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 15:01
 * @Version: 1.0.1
 **/
public abstract class Builder {

    // 设置产品的不同部分，以获得不同的产品
    public abstract void setPart1();

    public abstract void setPart2();

    public abstract void setPart3();

    // 其他部件...

    // 建造产品
    public abstract Product buildProduct();

}
