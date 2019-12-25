package com.ymdx.reflection.demo;

import com.ymdx.reflection.entity.User;

/**
 * @ClassName: GetClassDemo
 * @Description: 反射机制获取类的三种方式
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-25 15:39
 * @Version: 1.0
 **/
public class GetClassDemo {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        // 第一种方式
        Class<?> cls1 = Class.forName("com.ymdx.reflection.entity.User");
        User user1 = (User) cls1.newInstance();
        System.out.println(user1);

        // 第二种方式：Java中每个类类型都有class属性
        Class<User> cls2 = User.class;
        User user2 = cls2.newInstance();
        System.out.println(user2);

        // 第三种方式：Java语言中任何一个java对象都有getClass方法
        User user = new User();
        Class<? extends User> cls3 = user.getClass();
        User user3 = cls3.newInstance();
        System.out.println(user3);

    }

}
