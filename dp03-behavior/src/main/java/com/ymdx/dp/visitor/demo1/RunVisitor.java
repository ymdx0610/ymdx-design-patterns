package com.ymdx.dp.visitor.demo1;

/**
 * @ClassName: RunVisitor
 * @Description: 计算机硬件运转的访问者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 09:29
 * @Version: 1.0.1
 **/
public class RunVisitor implements ComputerVisitor {

    @Override
    public void vistCPU(CPU cpu) {
        cpu.run();
    }

    @Override
    public void vistHarddisk(Harddisk harddisk) {
        harddisk.run();
    }

}
