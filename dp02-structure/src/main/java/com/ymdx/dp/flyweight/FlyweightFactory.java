package com.ymdx.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: FlyweightFactory
 * @Description: 享元工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 20:07
 * @Version: 1.0.1
 **/
public class FlyweightFactory {

    private static Map<String, Flyweight> pool = new HashMap<>();

    // 私有构造方法
    private FlyweightFactory(){}

    public static Flyweight getFlyweight(String intrinsicState){
        Flyweight flyweight = pool.get(intrinsicState);
        if(flyweight == null){
            flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return flyweight;
    }

}
