package com.ymdx.dp.template_method.demo2;

/**
 * @ClassName: OpenCard
 * @Description: 银行开卡业务
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 11:18
 * @Version: 1.0
 **/
public class OpenCard extends BankBizTemplate {

    @Override
    protected void transact() {
        System.out.println("我要开通一张银行卡...");
    }

}
