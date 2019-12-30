package com.ymdx.dp.mediator.demo1;

/**
 * @ClassName: Person
 * @Description: 人类抽象类
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 15:37
 * @Version: 1.0.1
 **/
public abstract class Person {
    // 姓名
    String name;
    // 年龄
    int age;
    // 性别
    Sex sex;
    // 要求对象的年龄，对对象只有这一个要求
    int requestAge;
    // 婚姻中介
    MarriageAgency agency;

    public Person(String name, int age, Sex sex, int requestAge, MarriageAgency agency){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        this.agency = agency;
        agency.register(this);
    }

    // 寻找对象
    public void findPartner(){
        agency.pair(this);
    }

}

enum Sex {
    MALE, FEMALE;
}