package com.ymdx.dp.template_method.demo2;

/**
 * @ClassName: BankBizTemplate
 * @Description: 银行办理业务模板
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 11:15
 * @Version: 1.0
 **/
public abstract class BankBizTemplate {
    /** 1.取号排队 */
    public void takeNumber() {
        System.out.println("取号排队...");
    }

    /** 2.每个子类不同的业务实现，由子类实现*/
    protected abstract void transact();

    /** 3.评价 */
    public void evaluate() {
        System.out.println("反馈评价...");
    }

    public void process(){
        takeNumber();
        transact();
        evaluate();
    }

}
