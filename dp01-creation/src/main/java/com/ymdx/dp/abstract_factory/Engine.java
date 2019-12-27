package com.ymdx.dp.abstract_factory;

/**
 * @ClassName: Engine
 * @Description: 发动机
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-27 10:48
 * @Version: 1.0
 **/
public interface Engine {

    void feature();

    void start();

}

class EngineA implements Engine{

    @Override
    public void feature() {
        System.out.println("发送机马力大，转速快！");
    }

    @Override
    public void start() {
        System.out.println("发动机启动快，自动档！");
    }

}

class EngineB implements Engine{

    @Override
    public void feature() {
        System.out.println("发动机马力小，转速慢！");
    }

    @Override
    public void start() {
        System.out.println("发动机启动慢，手动档！");
    }

}