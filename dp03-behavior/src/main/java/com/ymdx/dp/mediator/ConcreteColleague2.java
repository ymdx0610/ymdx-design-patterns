package com.ymdx.dp.mediator;

/**
 * @ClassName: ConcreteColleague2
 * @Description: 具体同事2
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 15:13
 * @Version: 1.0.1
 **/
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("这是同事2的行动方法！");
    }

}
