package com.ymdx.dp.factory_method;

/**
 * @ClassName: ConcreteCreator
 * @Description: 具体工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 11:07
 * @Version: 1.0.1
 **/
public class ConcreteCreator implements Creator {

    @Override
    public <T extends Product> T factory(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)product;
    }

}
