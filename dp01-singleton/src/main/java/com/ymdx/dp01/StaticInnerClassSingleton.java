package com.ymdx.dp01;

/**
 * @ClassName: StaticInnerClassSingleton
 * @Description: 静态内部类单例模式
 *
 * 优势：兼顾了懒汉模式的内存优化（使用时才初始化）以及饿汉模式的安全性（不会被反射入侵）。
 * 劣势：需要两个类去做到这一点，虽然不会创建静态内部类的对象，但是其 Class 对象还是会被创建，而且是属于永久代的对象。
 *
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 11:11
 * @Version: 1.0
 **/
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){
        System.out.println("初始化...");
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

    private static class InnerClass{
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static void main(String[] args) {
        StaticInnerClassSingleton instance1 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton instance2 = StaticInnerClassSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}
