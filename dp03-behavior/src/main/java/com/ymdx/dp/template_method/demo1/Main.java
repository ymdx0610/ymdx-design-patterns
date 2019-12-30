package com.ymdx.dp.template_method.demo1;

/**
 * @ClassName: Main
 * @Description: 模板模式测试主方法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 11:10
 * @Version: 1.0
 **/
public class Main {

    public static void main(String[] args) {
        MsgTemplate mt = new SendMsgByMobile();
        mt.sendMsg();

        mt = new SendMsgByUnicom();
        mt.sendMsg();
    }

}
