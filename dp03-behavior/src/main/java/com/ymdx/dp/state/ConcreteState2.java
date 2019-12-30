package com.ymdx.dp.state;

/**
 * @ClassName: ConcreteState2
 * @Description: 具体状态角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 09:42
 * @Version: 1.0.1
 **/
public class ConcreteState2 extends State {

    // 状态2的行为逻辑处理
    @Override
    public void handle() {
        System.out.println("行为2的逻辑处理");
    }

}
