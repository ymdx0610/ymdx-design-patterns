package com.ymdx.dp.composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ConcreteCompany
 * @Description: 树枝节点ConcreteCompany
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 10:06
 * @Version: 1.0.1
 **/
public class ConcreteCompany implements Company {

    private List<Company> companyList = new ArrayList<>();

    // 姓名
    private String name;
    // 职位
    private String position;
    // 薪水
    private int salary;

    // 构造函数
    public ConcreteCompany(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void add(Company company){
        this.companyList.add(company);
    }

    public void remove(Company company){
        this.companyList.remove(company);
    }

    public List<Company> getChilid(){
        return this.companyList;
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
