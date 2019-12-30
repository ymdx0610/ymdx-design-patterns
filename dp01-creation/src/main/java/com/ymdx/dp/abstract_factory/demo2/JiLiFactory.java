package com.ymdx.dp.abstract_factory.demo2;

/**
 * @ClassName: JiLiFactory
 * @Description: 吉利汽车工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-27 10:58
 * @Version: 1.0
 **/
public class JiLiFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Chair createChair() {
        return new ChairB();
    }

}
