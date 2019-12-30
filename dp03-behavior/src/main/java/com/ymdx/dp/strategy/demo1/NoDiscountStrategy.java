package com.ymdx.dp.strategy.demo1;

/**
 * @ClassName: NoDiscountStrategy
 * @Description: 具体策略：无折扣算法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 14:10
 * @Version: 1.0.1
 **/
public class NoDiscountStrategy extends DiscountStrategy {

    public NoDiscountStrategy(double price, int number){
        super(price, number);
    }

    // 实现策略方法，0折扣额
    @Override
    public double calculateDiscount() {
        return 0;
    }

}
