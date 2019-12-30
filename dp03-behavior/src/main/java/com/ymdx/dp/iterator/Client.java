package com.ymdx.dp.iterator;

/**
 * @ClassName: Client
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 14:52
 * @Version: 1.0.1
 **/
public class Client {

    public static void main(String[] args) {
        // 定义聚集对象
        Aggregate agg = new ConcreteAggregate();
        agg.add("张三");
        agg.add("李四");
        agg.add("王五");

        // 遍历
        Iterator iterator = agg.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
