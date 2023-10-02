package com.ymdx.dp.factory.factory_method.demo1;

/**
 * @ClassName: AppleGardener
 * @Description: 苹果园丁，是一个用于生产苹果的具体工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 11:51
 * @Version: 1.0.1
 **/
public class AppleGardener implements FruitGardener {

    @Override
    public Fruit factory() {
        return new Apple();
    }

}
