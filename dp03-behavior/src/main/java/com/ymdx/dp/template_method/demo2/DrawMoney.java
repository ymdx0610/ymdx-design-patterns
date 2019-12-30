package com.ymdx.dp.template_method.demo2;

/**
 * @ClassName: DrawMoney
 * @Description: 银行取款业务
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 11:17
 * @Version: 1.0
 **/
public class DrawMoney extends BankBizTemplate{

    @Override
    protected void transact() {
        System.out.println("我要办理取款...");
    }

}
