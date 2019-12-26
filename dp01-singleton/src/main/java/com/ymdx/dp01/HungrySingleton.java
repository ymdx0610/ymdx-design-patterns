package com.ymdx.dp01;

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

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        HungrySingleton hs1 = new HungrySingleton();
        HungrySingleton hs2 = new HungrySingleton();
        System.out.println(hs1 == hs2);

        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}
