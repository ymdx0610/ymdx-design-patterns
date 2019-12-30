package com.ymdx.dp.prototype;

/**
 * @ClassName: Prototype
 * @Description: 抽象原型
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 16:55
 * @Version: 1.0.1
 **/
public interface Prototype extends Cloneable {

    // 克隆方法
    Prototype clone();

}
