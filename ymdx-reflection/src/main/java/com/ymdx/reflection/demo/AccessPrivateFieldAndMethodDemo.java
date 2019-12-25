package com.ymdx.reflection.demo;

import com.ymdx.reflection.entity.User;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName: AccessPrivateFieldAndMethodDemo
 * @Description: 使用反射为类私有属性赋值，调用私有方法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-25 16:38
 * @Version: 1.0
 **/
public class AccessPrivateFieldAndMethodDemo {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("com.ymdx.reflection.entity.User");
        // 获取类的所有属性
        Field[] declaredFields = cls.getDeclaredFields();
        Arrays.asList(declaredFields).stream().forEach(field -> {
            System.out.println(field.getName());
        });
        System.out.println("-------------");

        // 获取类的所有方法
        Method[] declaredMethods = cls.getDeclaredMethods();
        Arrays.asList(declaredMethods).stream().forEach(metod -> {
            System.out.println(metod.getName());
        });
        System.out.println("-------------");

        // 初始化对象
        User user = (User) cls.newInstance();
        // 获取私有id属性
        Field field = cls.getDeclaredField("id");
        // 开放访问权限
        field.setAccessible(true);
        // 给私有属性赋值
        field.set(user, 1L);
        System.out.println("使用反射值给私有id属性赋值，赋值后的id为：" + user.getId());
        System.out.println("-------------");

        // 获取私有show方法
        Method method = cls.getDeclaredMethod("show", String.class);
        // 开放访问权限
        method.setAccessible(true);
        // 调用私有方法
        method.invoke(user, "123");
    }

}
