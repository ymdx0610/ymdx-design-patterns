package com.ymdx.dp.visitor.demo1;

/**
 * @ClassName: TypeVisitor
 * @Description: 计算机硬件型号的访问者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 09:34
 * @Version: 1.0.1
 **/
public class TypeVisitor implements ComputerVisitor {

    @Override
    public void vistCPU(CPU cpu) {
        System.out.println("CPU型号为：" + cpu.getType());
    }

    @Override
    public void vistHarddisk(Harddisk harddisk) {
        System.out.println("硬盘型号：" + harddisk.getType());
    }

}
