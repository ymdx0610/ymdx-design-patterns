package com.ymdx.dp.factory_method.demo1;

/**
 * @ClassName: Fruit
 * @Description: 水果Fruit接口，是一个抽象产品
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 11:46
 * @Version: 1.0.1
 **/
public interface Fruit {

    // 生长
    public void grow();
    // 收获
    public void harvest();
    // 栽种
    public void plant();

}
