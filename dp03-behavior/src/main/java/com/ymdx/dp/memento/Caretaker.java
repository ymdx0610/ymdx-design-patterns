package com.ymdx.dp.memento;

/**
 * @ClassName: Caretaker
 * @Description: 负责人角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:13
 * @Version: 1.0.1
 **/
public class Caretaker {

    // 备忘录对象
    private Memento memento;
    public Memento getMemento(){
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
