package com.ymdx.dp.visitor;

/**
 * @ClassName: Visitor
 * @Description: 抽象访问者角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:36
 * @Version: 1.0.1
 **/
public interface Visitor {

    // 可以访问哪些对象
    public void visit(ConcreteElement1 e1);

    public void visit(ConcreteElement2 e2);

}
