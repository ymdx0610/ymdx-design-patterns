package com.ymdx.dp.prototype;


/**
 * @ClassName: ConcretePrototype
 * @Description: 具体原型
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 16:57
 * @Version: 1.0.1
 **/
public class ConcretePrototype implements Prototype {

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
