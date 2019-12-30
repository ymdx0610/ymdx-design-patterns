package com.ymdx.dp.visitor.demo1;

/**
 * @ClassName: Harddisk
 * @Description: 计算机硬盘
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 09:26
 * @Version: 1.0.1
 **/
public class Harddisk extends Hardware {

    public Harddisk(String type){
        super(type);
    }

    @Override
    public void run() {
        System.out.println("型号为" + type + "的硬盘正在运转");
    }

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        computerVisitor.vistHarddisk(this);
    }

}
