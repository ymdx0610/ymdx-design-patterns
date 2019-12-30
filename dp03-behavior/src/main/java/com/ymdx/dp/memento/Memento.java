package com.ymdx.dp.memento;

/**
 * @ClassName: Memento
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:10
 * @Version: 1.0.1
 **/
public class Memento {

    // 发起人的内部状态
    private  String state;

    // 构造函数传递参数
    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
