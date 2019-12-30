package com.ymdx.dp.flyweight.demo1;

/**
 * @ClassName: Game
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 20:21
 * @Version: 1.0.1
 **/
public class Game {

    public static void main(String[] args) {
        Chesspiece p1 = ChesspieceFactory.getChesspiece("黑");
        p1.put(1,1);
        Chesspiece p2 = ChesspieceFactory.getChesspiece("白");
        p2.put(2,2);
        Chesspiece p3 = ChesspieceFactory.getChesspiece("黑");
        p3.put(3,3);
        Chesspiece p4 = ChesspieceFactory.getChesspiece("白");
        p4.put(4,4);
    }

}
