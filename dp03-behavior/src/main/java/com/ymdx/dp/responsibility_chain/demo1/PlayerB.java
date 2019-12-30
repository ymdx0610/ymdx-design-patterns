package com.ymdx.dp.responsibility_chain.demo1;

/**
 * @ClassName: PlayerB
 * @Description: 具体玩家B
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 11:46
 * @Version: 1.0.1
 **/
public class PlayerB extends Player{
    // 构造函数
    public PlayerB(Player successor){
        this.setSuccessor(successor);
    }

    // 实现handle方法
    @Override
    public void handle(int i) {
        if(i == 2){
            System.out.println("PlayerB喝酒！");
        }else{
            System.out.println("PlayerB把花向下传！");
        }
        next(i);
    }
}
