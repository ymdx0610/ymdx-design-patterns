package com.ymdx.dp.composite.demo1;

/**
 * @ClassName: Employee
 * @Description: 叶子节点Employee
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 10:12
 * @Version: 1.0.1
 **/
public class Employee implements Company {

    // 姓名
    private String name;
    // 职位
    private String position;
    // 薪水
    private int salary;

    // 构造函数
    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }

}
