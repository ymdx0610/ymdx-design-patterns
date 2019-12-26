package com.ymdx.dp01;

/**
 * @ClassName: DoubleCheckLockSingleton
 * @Description: 双重检验锁单例模式
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 11:12
 * @Version: 1.0
 **/
public class DoubleCheckLockSingleton {

    private static DoubleCheckLockSingleton instance = null;

    private DoubleCheckLockSingleton(){}

    public static DoubleCheckLockSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckLockSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        DoubleCheckLockSingleton instance1 = DoubleCheckLockSingleton.getInstance();
        DoubleCheckLockSingleton instance2 = DoubleCheckLockSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}
