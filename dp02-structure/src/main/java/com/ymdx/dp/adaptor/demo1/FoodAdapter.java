package com.ymdx.dp.adaptor.demo1;

/**
 * @ClassName: FoodAdapter
 * @Description: 食品适配器
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-30 14:27
 * @Version: 1.0.1
 **/
public class FoodAdapter extends ShuiJiao implements Hundun {

    @Override
    public void makeHundun() {
        super.makeShuiJiao();
        System.out.println("馄炖和水饺一样是以面包馅的食品");
    }

}
