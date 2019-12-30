package com.ymdx.dp.iterator;

/**
 * @ClassName: ConcreteIterator
 * @Description: 具体迭代器角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 14:45
 * @Version: 1.0.1
 **/
public class ConcreteIterator implements Iterator {

    private ConcreteAggregate agg;
    private int index = 0;
    private int size = 0;

    public ConcreteIterator(ConcreteAggregate agg){
        this.agg = agg;
        size = agg.size();
        index = 0;
    }

    @Override
    public Object next() {
        if(index < size){
            return agg.getElement(index ++);
        }else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

}
