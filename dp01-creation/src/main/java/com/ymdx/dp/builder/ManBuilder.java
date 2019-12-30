package com.ymdx.dp.builder;

/**
 * @ClassName: ManBuilder
 * @Description: 具体的构造器（ConcreteBuilder）
 *
 * 实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。在建造过程完成后，提供产品的实例。
 *
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 09:53
 * @Version: 1.0
 **/
public class ManBuilder implements PersonBuilder{
    private Person person;

    public ManBuilder(){
        // 创建一个Person实例，用于调用set方法
        person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("头部分");
    }

    @Override
    public void buildBody() {
        person.setBody("身体部分");
    }

    @Override
    public void buildFoot() {
        person.setFoot("四肢部分");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
