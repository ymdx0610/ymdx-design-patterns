package com.ymdx.dp.builder;

/**
 * @ClassName: ConcreteBuilder
 * @Description: 具体建造者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 15:07
 * @Version: 1.0.1
 **/
public class ConcreteBuilder extends Builder {

    private Product product = new Product();

    // 设置产品零件
    @Override
    public void setPart1() {
        // 为product安装部件1
    }

    @Override
    public void setPart2() {
        // 为product安装部件2
    }

    @Override
    public void setPart3() {
        // 为product安装部件3
    }
    // 其他部件...

    // 建造一个产品
    @Override
    public Product buildProduct() {
        return product;
    }

}
