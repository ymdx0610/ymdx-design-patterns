package com.ymdx.dp.facade;

/**
 * @ClassName: Main
 * @Description: 外观模式测试主方法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 14:45
 * @Version: 1.0
 **/
public class Main {

    public static void main(String[] args) {
        MsgFacade msgFacade = new MsgFacade();
        msgFacade.sendMsg();
    }

}
