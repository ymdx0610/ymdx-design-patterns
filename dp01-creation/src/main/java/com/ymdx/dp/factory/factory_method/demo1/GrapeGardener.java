package com.ymdx.dp.factory.factory_method.demo1;

/**
 * @ClassName: GrapeGardener
 * @Description: 葡萄园丁，是一个用于生产葡萄的具体工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 11:59
 * @Version: 1.0.1
 **/
public class GrapeGardener implements FruitGardener {

    @Override
    public Fruit factory() {
        return new Grape();
    }

}
