package com.ymdx.dp.strategy.demo1;

/**
 * @ClassName: ContextClient
 * @Description: 环境角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 14:17
 * @Version: 1.0.1
 **/
public class ContextClient {

    private DiscountStrategy ds;

    // 构造函数
    public ContextClient(DiscountStrategy ds){
        this.ds = ds;
    }

    // 计算策略模式，计算折扣额
    public double contextCalDisc(){
        return ds.calculateDiscount();
    }

    public static void main(String[] args) {
        ContextClient context0 = new ContextClient(new NoDiscountStrategy(48.5, 20));
        System.out.println("0折扣：" + context0.contextCalDisc());

        ContextClient contextFix = new ContextClient(new FixDiscountStrategy(46, 60));
        System.out.println("固定折扣：" + contextFix.contextCalDisc());

        ContextClient contextPer = new ContextClient(new PercentageDiscountStrategy(38, 40));
        System.out.println("15%的折扣：" + contextPer.contextCalDisc());
    }

}
