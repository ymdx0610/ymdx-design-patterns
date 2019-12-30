package com.ymdx.dp.visitor;

/**
 * @ClassName: ConcreteVisitor
 * @Description: 具体访问者角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:43
 * @Version: 1.0.1
 **/
public class ConcreteVisitor implements Visitor {

    // 访问元素1
    @Override
    public void visit(ConcreteElement1 e1) {
        e1.operation();
    }

    // 访问元素2
    @Override
    public void visit(ConcreteElement2 e2) {
        e2.operation();
    }

}
