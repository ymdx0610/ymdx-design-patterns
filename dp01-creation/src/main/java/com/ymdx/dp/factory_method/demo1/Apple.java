package com.ymdx.dp.factory_method.demo1;

/**
 * @ClassName: Apple
 * @Description: 苹果Apple实现Fruit接口，是一个具体产品
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 11:52
 * @Version: 1.0.1
 **/
public class Apple implements Fruit {

    private int treeAge;

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }

    @Override
    public void grow() {
        System.out.println("苹果正在生长...");
    }

    @Override
    public void harvest() {
        System.out.println("收获苹果");
    }

    @Override
    public void plant() {
        System.out.println("栽种苹果");
    }

}
