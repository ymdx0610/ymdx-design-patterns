package com.ymdx.dp.command;

/**
 * @ClassName: Invoker
 * @Description: 调用者角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-09 09:21
 * @Version: 1.0.1
 **/
public class Invoker {

    private Command command;

    // 接收命令
    public void setCommand(Command command){
        this.command = command;
    }

    // 执行命令
    public void action(){
        this.command.execute();
    }

}
