package com.ymdx.dp.builder;

/**
 * @ClassName: Director
 * @Description: 导演者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 15:17
 * @Version: 1.0.1
 **/
public class Director {

    private Builder builder = new ConcreteBuilder();

    // 构造产品，负责调用各个零件建造方法
    public Product build(){
        builder.setPart1();
        builder.setPart2();
        builder.setPart3();
        // ...其他部件
        return builder.buildProduct();
    }

}
