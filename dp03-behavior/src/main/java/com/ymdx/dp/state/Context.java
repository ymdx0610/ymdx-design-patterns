package com.ymdx.dp.state;

/**
 * @ClassName: Context
 * @Description: 环境角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 09:38
 * @Version: 1.0.1
 **/
public class Context {

    // 定义状态
    public static State STATE1 = new ConcreteState1();
    public static State STATE2 = new ConcreteState2();

    // 当前状态
    private State currentState;
    // 获取当前状态
    public State getCurrentState() {
        return currentState;
    }
    // 设置当前状态
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        // 设置状态中的环境
        currentState.setContext(this);
    }

    // 行为委托
    public void handle1(){
        // 切换到状态1
        this.setCurrentState(STATE1);
        this.currentState.handle();
    }

    public void handle2(){
        // 切换到状态2
        this.setCurrentState(STATE2);
        this.currentState.handle();

    }


}
