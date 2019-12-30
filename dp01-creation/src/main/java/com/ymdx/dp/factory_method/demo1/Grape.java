package com.ymdx.dp.factory_method.demo1;

/**
 * @ClassName: Grape
 * @Description: 葡萄Grape实现Fruit接口，是一个具体产品
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 11:55
 * @Version: 1.0.1
 **/
public class Grape implements Fruit {

    private boolean seedless;

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }

    @Override
    public void grow() {
        System.out.println("葡萄正在生长...");
    }

    @Override
    public void harvest() {
        System.out.println("收获葡萄");
    }

    @Override
    public void plant() {
        System.out.println("栽种葡萄");
    }
}
