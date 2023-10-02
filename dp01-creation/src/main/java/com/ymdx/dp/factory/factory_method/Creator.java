package com.ymdx.dp.factory.factory_method;

/**
 * @ClassName: Creator
 * @Description: 抽象工厂
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 11:03
 * @Version: 1.0.1
 **/
public interface Creator {

    /**
     * @Author: ymdx
     * @Description: 工厂方法
     * 创建一个产品对象，其输入参数类型可以自行设置
     * @Date: 2019-09-29 11:30
     * @Param: [c]
     * @return: T
     **/
    public <T extends Product> T factory(Class<T> c);

}
