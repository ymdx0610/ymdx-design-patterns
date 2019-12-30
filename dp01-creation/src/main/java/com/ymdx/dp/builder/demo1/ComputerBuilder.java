package com.ymdx.dp.builder.demo1;

/**
 * @ClassName: ComputerBuilder
 * @Description: 计算机建造者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 16:33
 * @Version: 1.0.1
 **/
public interface ComputerBuilder {
    // 建造CPU
    void buildCpu();
    // 建造内存
    void buildRam();
    // 建造硬盘
    void buildHardDisk();
    // 建造显卡
    void buildGraphicCard();
    // 建造显示器
    void buildMonitor();
    // 建造操作系统
    void buildOs();
    // 得到建造好的计算机
    Computer getResult();
}
