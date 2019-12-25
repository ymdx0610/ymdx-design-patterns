package com.ymdx.reflection.demo;

import com.ymdx.reflection.entity.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName: CreateObjectDemo
 * @Description: 反射机制创建对象的方式
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-25 15:59
 * @Version: 1.0
 **/
public class CreateObjectDemo {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("com.ymdx.reflection.entity.User");
        // 方式一：调用类默认的无参构造方法
        User user1 = (User) cls.newInstance();
        System.out.println(user1);

        // 方式二：调用类的带参数的构造方法
        Constructor<?> constructor = cls.getConstructor(Long.class, String.class, String.class, String.class);
        User user2 = (User) constructor.newInstance(1L, "1001", "ymdx", "123456");
        System.out.println(user2);
    }

}
