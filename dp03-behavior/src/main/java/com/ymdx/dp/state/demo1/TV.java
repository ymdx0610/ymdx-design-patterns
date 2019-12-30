package com.ymdx.dp.state.demo1;

/**
 * @ClassName: TV
 * @Description: 电视机
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 09:52
 * @Version: 1.0.1
 **/
public class TV {

    // 电视可以看的频道（状态）
    public final static Channel CCTV1 = new CCTV1();
    public final static Channel CCTV2 = new CCTV2();
    public final static Channel CCTV3 = new CCTV3();

    // 当前频道
    private Channel channel;
    // 设置频道
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    // 播放CCTV1频道
    public void disCCTV1(){
        this.setChannel(CCTV1);
        this.channel.display();
    }

    // 播放CCTV2频道
    public void disCCTV2(){
        this.setChannel(CCTV2);
        this.channel.display();
    }

    // 播放CCTV3频道
    public void disCCTV3(){
        this.setChannel(CCTV3);
        this.channel.display();
    }

}
