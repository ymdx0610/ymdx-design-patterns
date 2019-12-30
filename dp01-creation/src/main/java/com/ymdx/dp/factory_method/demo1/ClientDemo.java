package com.ymdx.dp.factory_method.demo1;

/**
 * @ClassName: AbstractFactoryDemo
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 12:00
 * @Version: 1.0.1
 **/
public class ClientDemo {

    public static void main(String[] args) {
        // 苹果园丁工厂
        FruitGardener fruitGardener = new AppleGardener();
        // 通过工厂生产苹果
        Fruit apple = fruitGardener.factory();
        apple.plant();
        apple.grow();
        apple.harvest();

        // 葡萄园丁工厂
        fruitGardener = new GrapeGardener();
        // 通过工厂生产葡萄
        Fruit grape = fruitGardener.factory();
        grape.plant();
        grape.grow();
        grape.harvest();
    }

}
