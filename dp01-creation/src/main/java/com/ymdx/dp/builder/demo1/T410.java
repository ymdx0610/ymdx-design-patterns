package com.ymdx.dp.builder.demo1;

/**
 * @ClassName: T410
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 15:44
 * @Version: 1.0.1
 **/
public class T410 extends Computer {
    // 显卡
    private String graphicCard;

    public T410(){
        this.setType("ThinkPad T410i");
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public String toString() {
        return "型号：\t" + this.getType() + "\nCPU：\t" + this.getCpu() + "\n内存：\t" + this.getRam() + "\n硬盘：\t" + this.getHardDisk()
                + "\n显卡：\t" + this.getGraphicCard() + "\n显示器：\t" + this.getMonitor() + "\n操作系统：" + this.getOs();
    }

}
