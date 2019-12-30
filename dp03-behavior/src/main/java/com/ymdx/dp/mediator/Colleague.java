package com.ymdx.dp.mediator;

/**
 * @ClassName: Colleague
 * @Description: 抽象同事角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 15:07
 * @Version: 1.0.1
 **/
public abstract class Colleague {

    private Mediator mediator;

    // 构造函数
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // 抽象行动方法，由子类实现
    public abstract void action();

    // 业务方法，调用此方法改变对象的内部状态
    public void change(){
        this.mediator.colleagueChanged(this);
    }

}
