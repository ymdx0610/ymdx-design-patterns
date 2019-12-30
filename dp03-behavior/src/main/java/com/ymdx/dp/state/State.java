package com.ymdx.dp.state;

/**
 * @ClassName: State
 * @Description: 抽象状态角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 09:38
 * @Version: 1.0.1
 **/
public abstract class State {

    // 定义一个环境角色
    protected Context context;

    // 设置环境
    public void setContext(Context context) {
        this.context = context;
    }

    // 抽象行为
    public abstract void handle();


}
