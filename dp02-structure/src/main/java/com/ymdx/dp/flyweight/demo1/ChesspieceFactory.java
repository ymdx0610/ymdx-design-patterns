package com.ymdx.dp.flyweight.demo1;

/**
 * @ClassName: ChesspieceFactory
 * @Description: 棋子工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 20:18
 * @Version: 1.0.1
 **/
public class ChesspieceFactory {

    static final Chesspiece WHITE = new ChesspieceFlyweight("白");
    static final Chesspiece BLACK = new ChesspieceFlyweight("黑");

    public static Chesspiece getChesspiece(String color){
        if(color.equals("白")){
            return WHITE;
        }else if(color.equals("黑")){
            return BLACK;
        }
        return null;
    }

}
