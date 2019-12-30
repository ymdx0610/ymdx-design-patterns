package com.ymdx.dp.state;

/**
 * @ClassName: ConcreteState1
 * @Description: 具体状态角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 09:41
 * @Version: 1.0.1
 **/
public class ConcreteState1 extends State {

    // 状态1的行为逻辑处理
    @Override
    public void handle() {
        System.out.println("行为1的逻辑处理");
    }

}
