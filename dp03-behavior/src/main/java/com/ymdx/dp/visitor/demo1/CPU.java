package com.ymdx.dp.visitor.demo1;

/**
 * @ClassName: CPU
 * @Description: 计算机CPU
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 18:01
 * @Version: 1.0.1
 **/
public class CPU extends Hardware {

    public CPU(String type){
        super(type);
    }

    @Override
    public void run() {
        System.out.println("型号为：" + type + "的CPU正在运转");
    }

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        computerVisitor.vistCPU(this);
    }

}
