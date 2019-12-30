package com.ymdx.dp.command.demo1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName: MyFrame
 * @Description: 图形窗口
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-09 09:34
 * @Version: 1.0.1
 **/
public class MyFrame extends JFrame implements ActionListener {

    private JPanel p;
    private YellowCommand btnYellow;
    private RedCommand btnRed;
    private ExitCommand btnExit;

    public MyFrame(){
        super("命令模式");
        p = new JPanel();
        this.add(p);
        // 实例化具体命令
        btnYellow = new YellowCommand("黄色", p);
        btnRed = new RedCommand("红色", p);
        btnExit = new ExitCommand("退出");

        // 将按钮控件添加到面板
        p.add(btnYellow);
        p.add(btnRed);
        p.add(btnExit);

        // 添加监听对象
        btnYellow.addActionListener(this);
        btnRed.addActionListener(this);
        btnExit.addActionListener(this);

        // 设置窗体
        this.setSize(400, 300);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        MyCommand obj = (MyCommand) e.getSource();
        obj.execute();
    }

    public static void main(String[] args) {
        new MyFrame();
    }

}
