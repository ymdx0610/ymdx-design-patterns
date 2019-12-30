package com.ymdx.dp.visitor;

/**
 * @ClassName: ConcreteElement2
 * @Description: 具体元素角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:41
 * @Version: 1.0.1
 **/
public class ConcreteElement2 extends Element {

    // 接受操作
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // 业务逻辑方法
    public void operation(){
        System.out.println("访问元素2");
    }

}
