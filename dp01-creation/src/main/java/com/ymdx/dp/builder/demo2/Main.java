package com.ymdx.dp.builder.demo2;

/**
 * @ClassName: Main
 * @Description: 建造者测试主方法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 09:59
 * @Version: 1.0
 **/
public class Main {

    public static void main(String[] args) {
        PersonDirector pb = new PersonDirector();
        Person person = pb.constructPerson(new ManBuilder());
        System.out.println(person);
    }

}
