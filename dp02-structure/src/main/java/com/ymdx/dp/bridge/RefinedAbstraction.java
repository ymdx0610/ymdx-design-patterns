package com.ymdx.dp.bridge;

/**
 * @ClassName: RefinedAbstraction
 * @Description: 修正抽象化角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 10:41
 * @Version: 1.0.1
 **/
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    // 修正父类的方法
    @Override
    public void operation(){
        // 业务代码
    }

}
