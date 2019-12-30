package com.ymdx.dp.mediator;

/**
 * @ClassName: ConcreteMediator
 * @Description: 具体中介者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 15:11
 * @Version: 1.0.1
 **/
public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 c1;
    private ConcreteColleague2 c2;

    // 中介者模式的业务逻辑方法
    @Override
    public void colleagueChanged(Colleague c) {
        c1.action();
        c2.action();
    }

    // 工厂方法，创建同事对象
    public void createConcreteMediator(){
        c1 = new ConcreteColleague1(this);
        c2 = new ConcreteColleague2(this);
    }

    // 获取同事对象
    public ConcreteColleague1 getC1() {
        return c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }

}
