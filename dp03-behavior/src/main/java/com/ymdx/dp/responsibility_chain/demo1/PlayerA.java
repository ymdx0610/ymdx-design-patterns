package com.ymdx.dp.responsibility_chain.demo1;

/**
 * @ClassName: PlayerA
 * @Description: 具体玩家A
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 11:43
 * @Version: 1.0.1
 **/
public class PlayerA extends Player{

    // 构造函数
    public PlayerA(Player successor){
        this.setSuccessor(successor);
    }

    // 实现handle方法
    @Override
    public void handle(int i) {
        if(i == 1){
            System.out.println("PlayerA喝酒！");
        }else{
            System.out.println("PlayerA把花向下传！");
        }
        next(i);
    }

}
