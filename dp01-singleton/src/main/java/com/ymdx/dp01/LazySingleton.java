package com.ymdx.dp01;

/**
 * @ClassName: LazySingleton
 * @Description: 懒汉式单例模式
 *
 * 特点：类初始化的时候不会创建对象，真正需要的时候才会加载创建对象，天生线程不安全，需要解决线程安全问题，所以效率比较低
 *
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 11:00
 * @Version: 1.0
 **/
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}
