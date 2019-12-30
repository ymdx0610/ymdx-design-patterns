package com.ymdx.dp.visitor;

/**
 * @ClassName: Element
 * @Description: 抽象元素角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:35
 * @Version: 1.0.1
 **/
public abstract class Element {

    // 接受操作
    public abstract void accept(Visitor visitor);

}
