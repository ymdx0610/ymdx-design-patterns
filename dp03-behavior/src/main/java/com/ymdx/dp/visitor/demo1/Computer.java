package com.ymdx.dp.visitor.demo1;

/**
 * @ClassName: Computer
 * @Description: 计算机
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:58
 * @Version: 1.0.1
 **/
public class Computer {

    private Hardware cpu;
    private Hardware harddisk;

    public Computer(){
        this.cpu = new CPU("Intel Core i7-620");
        this.harddisk = new Harddisk("Seagate 500G 7200转");
    }

    public void accept(ComputerVisitor computerVisitor){
        cpu.accept(computerVisitor);
        harddisk.accept(computerVisitor);
    }

}
