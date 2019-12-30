package com.ymdx.dp.memento;

/**
 * @ClassName: Client
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:14
 * @Version: 1.0.1
 **/
public class Client {

    public static void main(String[] args) {
        // 定义发起人
        Originator originator = new Originator();

        // 定义负责人
        Caretaker caretaker = new Caretaker();

        // 创建一个备忘录
        caretaker.setMemento(originator.createMemento());

        // 恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());
    }

}
