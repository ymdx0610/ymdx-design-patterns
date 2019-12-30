package com.ymdx.dp.decorator.demo1;

/**
 * @ClassName: ConcreteCarDecorator
 * @Description: 具体汽车的装饰者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-30 14:00
 * @Version: 1.0.1
 **/
public class ConcreteCarDecorator extends CarDecorator {

    public ConcreteCarDecorator(Car car) {
        super(car);
    }

    // 给汽车进行彩绘
    private void print(){
        System.out.println("在车尾绘制\"新手\"字样，颜色是紫色霞光");
    }

    // 给汽车安装GPS设备
    private void setGps(){
        System.out.println("安装GPS定位导航系统");
    }

    @Override
    public void show() {
        super.show();
        this.print();
        this.setGps();
    }

}
