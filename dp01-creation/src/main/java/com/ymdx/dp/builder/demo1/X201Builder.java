package com.ymdx.dp.builder.demo1;

/**
 * @ClassName: X201Builder
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 16:41
 * @Version: 1.0.1
 **/
public class X201Builder implements ComputerBuilder {

    private X201 computer = new X201();

    @Override
    public void buildCpu() {
        computer.setCpu("i3-350");
    }

    @Override
    public void buildRam() {
        computer.setRam("2GB 1333MHz");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("250GB 5400转");
    }

    @Override
    public void buildGraphicCard() {
        // 无显示
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("12英寸 1280*800");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows7 Home版");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
