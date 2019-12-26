package com.ymdx.dp.singleton;

import java.lang.reflect.Constructor;

/**
 * @ClassName: HungrySingleton
 * @Description: 饿汉式单例模式
 *
 * 特点：类初始化时，会立即加载该对象，线程天生安全，调用效率高；但如果在不使用该对象的时候，会浪费内存
 *
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 10:50
 * @Version: 1.0
 **/
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();
    private static boolean flag = false;

    private HungrySingleton(){
        // 单例防止反射漏洞攻击
        synchronized (HungrySingleton.class){
            if (!flag){
                flag = true;
            }else {
                throw new RuntimeException("单实例对象不允许被重复创建！");
            }
        }
    }

    public static HungrySingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) throws Exception {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance1 == instance2);

//        Class<?> cls = Class.forName("com.ymdx.dp.singleton.HungrySingleton");
//        Constructor<?> constructor = cls.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton instance3 = (HungrySingleton) constructor.newInstance();
//        System.out.println(instance1 == instance3);
//        new HungrySingleton();
    }

}
