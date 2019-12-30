package com.ymdx.dp.simple_factory.demo1;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName: CarFactory
 * @Description: 汽车简单工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 15:35
 * @Version: 1.0
 **/
public class CarFactory {

    public Car createCar(String name){
        if(StringUtils.isBlank(name)){
            return null;
        }
        if("Byd".equals(name)){
            System.out.println("创建比亚迪汽车");
            return new BydCar();
        }
        if("JiLi".equals(name)){
            System.out.println("创建吉利汽车");
            return new JiLi();
        }
        return null;
    }

}
