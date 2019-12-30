package com.ymdx.dp.responsibility_chain.demo1;

/**
 * @ClassName: Player
 * @Description: 击鼓传花游戏玩家抽象类
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 11:40
 * @Version: 1.0.1
 **/
public abstract class Player {

    private Player successor;
    public abstract void handle(int i);
    protected void setSuccessor(Player aSuccessor){
        successor = aSuccessor;
    }

    // 传给下一个
    public void next(int index){
        if(successor != null){
            successor.handle(index);
        }else{
            System.out.println("游戏结束");
        }
    }

}
