package com.ymdx.dp.bridge.demo1;

/**
 * @ClassName: AbstractShape
 * @Description: 图形抽象类
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 11:37
 * @Version: 1.0.1
 **/
public abstract class AbstractShape {

    Color color;

    public AbstractShape(Color color){
        this.color = color;
    }

    public abstract void draw();

}
