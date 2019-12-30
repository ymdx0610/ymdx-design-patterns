package com.ymdx.dp.bridge.demo1;

/**
 * @ClassName: Circle
 * @Description: 圆形
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 13:09
 * @Version: 1.0.1
 **/
public class Circle extends AbstractShape {

    public Circle(Color color){
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("使用" + color.getColor() + "画图形");
    }

}
