package com.ymdx.dp.strategy.demo1;

/**
 * @ClassName: PercentageDiscountStrategy
 * @Description: 具体策略：按百分比折扣的算法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 14:14
 * @Version: 1.0.1
 **/
public class PercentageDiscountStrategy extends DiscountStrategy {

    public PercentageDiscountStrategy(double price, int number){
        super(price, number);
    }

    // 实现策略方法，百分比为15%的折扣额
    @Override
    public double calculateDiscount() {
        return getNumber() * getPrice() * 0.15;
    }

}
