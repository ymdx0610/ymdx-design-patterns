package com.ymdx.dp.command;

/**
 * @ClassName: ConcreteCommand
 * @Description: 具体命令角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-09 09:19
 * @Version: 1.0.1
 **/
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    // 执行方法
    @Override
    public void execute() {
        this.receiver.action();
    }

}
