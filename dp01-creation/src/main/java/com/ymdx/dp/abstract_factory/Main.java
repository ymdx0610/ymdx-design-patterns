package com.ymdx.dp.abstract_factory;

/**
 * @ClassName: Main
 * @Description: 抽象工厂模式测试主方法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-27 11:01
 * @Version: 1.0
 **/
public class Main {

    public static void main(String[] args) {
        BydFactory bydFactory = new BydFactory();
        Engine engine = bydFactory.createEngine();
        Chair chair = bydFactory.createChair();
        engine.feature();
        engine.start();
        chair.feature();
        System.out.println("------------");

        JiLiFactory jiLiFactory = new JiLiFactory();
        Engine engine1 = jiLiFactory.createEngine();
        Chair chair1 = jiLiFactory.createChair();
        engine1.feature();
        engine1.start();
        chair1.feature();
    }

}
