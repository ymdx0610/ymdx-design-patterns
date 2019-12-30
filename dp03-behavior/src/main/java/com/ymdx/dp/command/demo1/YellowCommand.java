package com.ymdx.dp.command.demo1;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName: YellowCommand
 * @Description: 具体命令
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-09 09:29
 * @Version: 1.0.1
 **/
public class YellowCommand extends JButton implements MyCommand {

    private JPanel p;

    // 构造函数
    public YellowCommand(String name, JPanel p){
        // 构造一个按钮控件
        super(name);
        this.p = p;
    }

    @Override
    public void execute() {
        // 改变面板背景颜色
        p.setBackground(Color.YELLOW);
    }

}
