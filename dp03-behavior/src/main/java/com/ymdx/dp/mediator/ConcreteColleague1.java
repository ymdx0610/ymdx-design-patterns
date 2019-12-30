package com.ymdx.dp.mediator;

/**
 * @ClassName: ConcreteColleague1
 * @Description: 具体同事1
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 15:11
 * @Version: 1.0.1
 **/
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator){
        super(mediator);
    }

    // 实现具体行动方法
    @Override
    public void action() {
        System.out.println("这是同事1的行动方法！");
    }

}
