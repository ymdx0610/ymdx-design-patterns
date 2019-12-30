package com.ymdx.dp.template_method.demo1;

/**
 * @ClassName: SendMsgByMobile
 * @Description: 通过移动运营商发送短信
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 11:08
 * @Version: 1.0
 **/
public class SendMsgByMobile extends MsgTemplate {

    @Override
    protected void sendHttpRequest() {
        System.out.println("正在通过移动运营商发送短信...");
    }

}
