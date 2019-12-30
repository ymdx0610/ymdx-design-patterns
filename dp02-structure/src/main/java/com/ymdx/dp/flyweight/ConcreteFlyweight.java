package com.ymdx.dp.flyweight;

/**
 * @ClassName: ConcreteFlyweight
 * @Description: 具体享元角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 20:04
 * @Version: 1.0.1
 **/
public class ConcreteFlyweight implements Flyweight {

    // 内部状态
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("内部状态：" + intrinsicState + "，外部状态：" + extrinsicState);
    }


}
