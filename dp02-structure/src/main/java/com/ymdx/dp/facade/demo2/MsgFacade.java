package com.ymdx.dp.facade.demo2;

/**
 * @ClassName: MsgFacade
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 14:42
 * @Version: 1.0
 **/
public class MsgFacade {

    private SmsMsgService smsMsgService;
    private WeChatMsgService weChatMsgService;
    private EmailMsgService emailMsgService;

    public MsgFacade(){
        smsMsgService = new SmsMsgServiceImpl();
        weChatMsgService = new WeChatMsgServiceImpl();
        emailMsgService = new EmailMsgServiceImpl();
    }

    public void sendMsg(){
        smsMsgService.sendMsg();
        weChatMsgService.sendMsg();
        emailMsgService.sendMsg();
    }

}
