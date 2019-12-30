package com.ymdx.dp.iterator;

import java.util.Vector;

/**
 * @ClassName: ConcreteAggregate
 * @Description: 具体聚集角色
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 14:47
 * @Version: 1.0.1
 **/
public class ConcreteAggregate implements Aggregate {

    private Vector vector = new Vector();

    @Override
    public void add(Object obj) {
        this.vector.add(obj);
    }

    public Object getElement(int index){
        if(index < vector.size()){
            return vector.get(index);
        }else{
            return null;
        }
    }

    public int size(){
        return vector.size();
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

}
