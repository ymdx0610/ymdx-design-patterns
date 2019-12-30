package com.ymdx.dp.singleton.demo1;

/**
 * @ClassName: GlobalNum
 * @Description: 使用单例模式记录访问次数
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 10:24
 * @Version: 1.0.1
 **/
public class GlobalNum {

    private static GlobalNum gn = new GlobalNum();

    private GlobalNum(){}

    public static GlobalNum getInstance(){
        return gn;
    }

    private int num = 0;

    public synchronized int getNum(){
        return ++num;
    }

}
