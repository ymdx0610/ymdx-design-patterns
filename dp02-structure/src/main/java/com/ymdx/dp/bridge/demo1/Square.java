package com.ymdx.dp.bridge.demo1;

/**
 * @ClassName: Square
 * @Description: 正方形
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 13:11
 * @Version: 1.0.1
 **/
public class Square extends AbstractShape {

    public Square(Color color){
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("使用" + color.getColor() + "画正方形");
    }

}
