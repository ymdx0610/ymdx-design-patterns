package com.ymdx.dp.facade;

/**
 * @ClassName: Facade
 * @Description: 外观角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 13:19
 * @Version: 1.0.1
 **/
public class Facade {

    // 被委托的对象
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    // 提供外界访问的方法
    public void methodA(){
        classA.methodA();
    }

    public void mehtodB(){
        classB.methodB();
    }

    public void mehtodC(){
        classC.methodC();
    }

}
