package com.ymdx.dp.decorator;

/**
 * @ClassName: ConcreteDecorator
 * @Description: 具体修饰者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-30 10:40
 * @Version: 1.0.1
 **/
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    // 定义自己的方法
    private void method(){
        System.out.println("修饰");
    }

    // 重写operation方法
    @Override
    public void operation() {
        super.operation();
        this.method();
    }

}
