package com.ymdx.dp.adaptor.demo2;

/**
 * @ClassName: ElectricCooker
 * @Description: 日本电饭煲
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 11:34
 * @Version: 1.0
 **/
public class ElectricCooker {
    private JP110VInterface jp110VInterface;

    ElectricCooker(JP110VInterface jp110VInterface){
        this.jp110VInterface=jp110VInterface;
    }

    public void cook(){
        jp110VInterface.connect();
        System.out.println("开始煮饭了...");
    }

}
