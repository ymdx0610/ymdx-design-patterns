package com.ymdx.dp.visitor;

import java.util.Random;
import java.util.Vector;

/**
 * @ClassName: ObjectStructure
 * @Description: 结构角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:45
 * @Version: 1.0.1
 **/
public class ObjectStructure {

    private Vector<Element> elements = new Vector<>();

    // 构造函数
    public ObjectStructure(){
        elements = new Vector<>();
    }

    // 执行访问操作
    public void action(Visitor visitor){
        for(Element e : elements){
            e.accept(visitor);
        }
    }

    // 添加新元素
    public void add(Element e){
        elements.add(e);
    }

    // 元素生成器，这里通过一个工厂方法进行模拟
    public void createElements(){
        Random random = new Random();
        for(int i=0; i < 10; i++){
            if(random.nextInt(100) > 50){
                // 添加元素1
                this.add(new ConcreteElement1());
            }else{
                // 添加元素2
                this.add(new ConcreteElement2());
            }
        }
    }

}
