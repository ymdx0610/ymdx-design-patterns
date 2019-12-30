package com.ymdx.dp.builder.demo1;

/**
 * @ClassName: ComputerTest
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 16:48
 * @Version: 1.0.1
 **/
public class ComputerTest {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        Computer t410 = director.constructT410();
        System.out.println(t410);
        System.out.println("------------------------------");
        Computer x201 = director.constructX201();
        System.out.println(x201);
    }

}
