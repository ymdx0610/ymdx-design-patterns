package com.ymdx.dp.builder.demo1;

/**
 * @ClassName: T410Builder
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 16:32
 * @Version: 1.0.1
 **/
public class T410Builder implements ComputerBuilder {

    private T410 computer = new T410();

    @Override
    public void buildCpu() {
        computer.setCpu("i5-450");
    }

    @Override
    public void buildRam() {
        computer.setRam("4GB 1333MHz");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("500GB 7200转");
    }

    @Override
    public void buildGraphicCard() {
        computer.setGraphicCard("NvidiaNVS 3100M");
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("14英寸 1280*800");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows7 旗舰版");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
