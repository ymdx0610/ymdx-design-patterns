package com.ymdx.dp.facade.demo1;

/**
 * @ClassName: Boss
 * @Description: 测试应用：老板类
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 13:32
 * @Version: 1.0.1
 **/
public class Boss {

    public static void main(String[] args) {
        Secretary s = new Secretary();
        System.out.println("老板告诉秘书要到上海出差10天");
        s.trip("上海", 10);
        System.out.println("------------------------");
        System.out.println("老板告诉秘书要请8个人吃饭");
        s.repast(8);
    }

}
