package com.ymdx.dp.iterator;

/**
 * @ClassName: Aggregate
 * @Description: 抽象聚集角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 14:46
 * @Version: 1.0.1
 **/
public interface Aggregate {

    public void add(Object obj);

    public Iterator createIterator();

}
