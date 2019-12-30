package com.ymdx.dp.builder;

/**
 * @ClassName: PersonBuilder
 * @Description: 抽象的游戏人物构造器（Builder）
 *
 * 给出一个抽象接口，以规范产品对象的各个组成成分的建造。这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建
 *
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 09:47
 * @Version: 1.0
 **/
public interface PersonBuilder {

    /**构造头部*/
    void buildHead();
    /**构造身体*/
    void buildBody();
    /**构造尾部*/
    void buildFoot();

    /**组装，构造人物*/
    Person buildPerson();

}
