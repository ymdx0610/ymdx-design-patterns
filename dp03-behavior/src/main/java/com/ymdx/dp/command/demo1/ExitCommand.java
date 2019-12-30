package com.ymdx.dp.command.demo1;

import javax.swing.*;

/**
 * @ClassName: ExitCommand
 * @Description: 具体命令
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-09 09:33
 * @Version: 1.0.1
 **/
public class ExitCommand extends JButton implements MyCommand {

    // 构造函数
    public ExitCommand(String name){
        super(name);
    }

    @Override
    public void execute() {
        // 系统退出
        System.exit(0);
    }

}
