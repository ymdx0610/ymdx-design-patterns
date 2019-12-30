package com.ymdx.dp.template_method.demo2;

/**
 * @ClassName: Main
 * @Description: 模板模式测试主方法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 11:19
 * @Version: 1.0
 **/
public class Main {

    public static void main(String[] args) {
        BankBizTemplate bbt = new DrawMoney();
        bbt.process();

        bbt = new OpenCard();
        bbt.process();
    }

}
