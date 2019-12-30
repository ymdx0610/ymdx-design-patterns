package com.ymdx.dp.responsibility_chain.demo1;

/**
 * @ClassName: PlayerD
 * @Description: 具体玩家D
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 11:48
 * @Version: 1.0.1
 **/
public class PlayerD extends Player {

    // 构造函数
    public PlayerD(Player successor){
        this.setSuccessor(successor);
    }

    // 实现handle方法
    @Override
    public void handle(int i) {
        if(i == 4){
            System.out.println("PlayerD喝酒！");
        }else{
            System.out.println("PlayerD把花向下传！");
        }
        next(i);
    }

}
