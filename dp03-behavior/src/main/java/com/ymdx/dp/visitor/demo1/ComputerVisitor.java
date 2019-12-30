package com.ymdx.dp.visitor.demo1;

/**
 * @ClassName: ComputerVisitor
 * @Description: 计算机访问者接口
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 09:23
 * @Version: 1.0.1
 **/
public interface ComputerVisitor {

    // 访问CPU
    void vistCPU(CPU cpu);
    // 访问硬盘
    void vistHarddisk(Harddisk harddisk);

}
