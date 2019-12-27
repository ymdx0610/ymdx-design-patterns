package com.ymdx.dp.abstract_factory;

/**
 * @ClassName: CarFactory
 * @Description: 汽车拼装工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-27 10:56
 * @Version: 1.0
 **/
public interface CarFactory {

    // 创建发动机
    Engine createEngine();

    // 创建座椅
    Chair createChair();

}
