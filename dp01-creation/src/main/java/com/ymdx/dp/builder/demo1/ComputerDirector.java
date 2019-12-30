package com.ymdx.dp.builder.demo1;

/**
 * @ClassName: ComputerDirector
 * @Description: 构造计算机的导演者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 16:44
 * @Version: 1.0.1
 **/
public class ComputerDirector {

    ComputerBuilder builder;

    // 构造T410计算机
    public T410 constructT410(){
        builder = new T410Builder();
        builder.buildCpu();
        builder.buildRam();
        builder.buildHardDisk();
        builder.buildGraphicCard();
        builder.buildMonitor();
        builder.buildOs();
        return (T410) builder.getResult();
    }

    // 构造X201计算机
    public X201 constructX201(){
        builder = new X201Builder();
        builder.buildCpu();
        builder.buildRam();
        builder.buildHardDisk();
        builder.buildMonitor();
        builder.buildOs();
        return (X201) builder.getResult();
    }

}
