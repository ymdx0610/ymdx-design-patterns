package com.ymdx.dp.command.demo1;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName: RedCommand
 * @Description: 具体命令
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-09 09:31
 * @Version: 1.0.1
 **/
public class RedCommand extends JButton implements MyCommand {

    private JPanel p;

    // 构造函数
    public RedCommand(String name, JPanel p){
        // 构造一个按钮控件
        super(name);
        this.p = p;
    }

    @Override
    public void execute() {
        // 改变面板背景颜色
        p.setBackground(Color.RED);
    }

}
