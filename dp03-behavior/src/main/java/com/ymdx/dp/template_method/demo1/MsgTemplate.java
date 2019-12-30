package com.ymdx.dp.template_method.demo1;

/**
 * @ClassName: MsgTemplate
 * @Description: 消息模板
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 11:04
 * @Version: 1.0
 **/
public abstract class MsgTemplate {

    public void sendMsg(){
        // 1. 记录发短信开始日志
        logStart();
        // 2. 发送Http请求
        sendHttpRequest();
        // 3. 记录发短信结束日志
        logEnd();
    }

    protected abstract void sendHttpRequest();

    protected void logEnd(){
        System.out.println("发短信---end---");
    }

    public void logStart(){
        System.out.println("发短信---start---");
    }

}
