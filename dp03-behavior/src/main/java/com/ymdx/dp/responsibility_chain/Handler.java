package com.ymdx.dp.responsibility_chain;

/**
 * @ClassName: Handler
 * @Description: 抽象处理者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 11:31
 * @Version: 1.0.1
 **/
public abstract class Handler {

    private Handler successor;

    // 处理方法
    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

}
