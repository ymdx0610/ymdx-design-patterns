package com.ymdx.dp.strategy.demo1;

/**
 * @ClassName: FixDiscountStrategy
 * @Description: 具体策略：固定折扣值为1的算法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 14:12
 * @Version: 1.0.1
 **/
public class FixDiscountStrategy extends DiscountStrategy {

    public FixDiscountStrategy(double price, int number){
        super(price, number);
    }

    // 实现策略方法，固定折扣额
    @Override
    public double calculateDiscount() {
        return getNumber() * 1;
    }

}
