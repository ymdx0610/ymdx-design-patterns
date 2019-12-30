package com.ymdx.dp.memento;

/**
 * @ClassName: Originator
 * @Description: 发起人角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:09
 * @Version: 1.0.1
 **/
public class Originator {

    // 内部壮体啊
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建备忘录
    public Memento createMemento(){
        return new Memento(this.state);
    }

    // 恢复一个备忘录
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }

}
