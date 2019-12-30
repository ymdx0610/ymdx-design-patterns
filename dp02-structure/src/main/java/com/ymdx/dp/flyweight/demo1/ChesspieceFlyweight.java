package com.ymdx.dp.flyweight.demo1;

/**
 * @ClassName: ChesspieceFlyweight
 * @Description: 棋子具体享元
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 20:14
 * @Version: 1.0.1
 **/
public class ChesspieceFlyweight implements Chesspiece {

    private String color;

    public ChesspieceFlyweight(String color){
        this.color = color;
    }

    @Override
    public void put(int x, int y) {
        System.out.println("在(" + x + "," + y + ")位置放了一个" + color + "子");
    }

}
