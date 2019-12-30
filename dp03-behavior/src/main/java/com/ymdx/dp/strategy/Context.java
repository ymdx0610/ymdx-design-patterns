package com.ymdx.dp.strategy;

/**
 * @ClassName: Context
 * @Description: 环境角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 13:49
 * @Version: 1.0.1
 **/
public class Context {

    private Strategy strategy = null;

    // 构造函数
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    // 调用策略方法
    public void contextInterface(){
        this.strategy.strategyInterface();
    }

}
