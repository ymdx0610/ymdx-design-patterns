package com.ymdx.dp.abstract_factory.demo2;

/**
 * @ClassName: BydFactory
 * @Description: 比亚迪汽车工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-27 11:00
 * @Version: 1.0
 **/
public class BydFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Chair createChair() {
        return new ChairA();
    }
}
