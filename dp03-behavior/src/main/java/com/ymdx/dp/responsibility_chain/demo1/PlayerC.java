package com.ymdx.dp.responsibility_chain.demo1;

/**
 * @ClassName: PlayerC
 * @Description: 具体玩家C
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 11:47
 * @Version: 1.0.1
 **/
public class PlayerC extends Player {
    // 构造函数
    public PlayerC(Player successor){
        this.setSuccessor(successor);
    }

    // 实现handle方法
    @Override
    public void handle(int i) {
        if(i == 3){
            System.out.println("PlayerC喝酒！");
        }else{
            System.out.println("PlayerC把花向下传！");
        }
        next(i);
    }
}
