package com.ymdx.dp.builder.demo1;

/**
 * @ClassName: X201
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 15:54
 * @Version: 1.0.1
 **/
public class X201 extends Computer {

    public X201(){
        this.setType("ThinkPad X201i");
    }

    @Override
    public String toString() {
        return "型号：\t" + this.getType() + "\nCPU：\t" + this.getCpu() + "\n内存：\t" + this.getRam() + "\n硬盘：\t" + this.getHardDisk()
                + "\n显示器：\t" + this.getMonitor() + "\n操作系统：" + this.getOs();
    }

}
