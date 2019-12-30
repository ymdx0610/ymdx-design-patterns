package com.ymdx.dp.visitor.demo1;

/**
 * @ClassName: Hardware
 * @Description: 计算机各种硬件抽象类
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:56
 * @Version: 1.0.1
 **/
public abstract class Hardware {

    // 型号
    String type;

    public Hardware(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    // 运转
    public abstract void run();

    // 接受计算机访问者
    public abstract void accept(ComputerVisitor computerVisitor);

}
