package com.ymdx.dp.decorator;

/**
 * @ClassName: Decorator
 * @Description: 抽象装饰者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-30 10:37
 * @Version: 1.0.1
 **/
public abstract class Decorator implements Component{

    private Component component = null;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }

}
