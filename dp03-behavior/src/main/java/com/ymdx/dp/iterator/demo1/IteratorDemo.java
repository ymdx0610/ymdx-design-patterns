package com.ymdx.dp.iterator.demo1;

import java.util.*;

/**
 * @ClassName: IteratorDemo
 * @Description: Java API中迭代器的应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 14:56
 * @Version: 1.0.1
 **/
public class IteratorDemo {

    public static void main(String[] args) {
        // 定义一个向量集合
        Vector vector = new Vector();
        vector.add("向量1");
        vector.add("向量2");
        vector.add("向量3");
        vector.add("向量4");

        // 定义一个序列
        List list = new ArrayList();
        list.add("序列1");
        list.add("序列2");
        list.add("序列3");

        // 定义栈
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        // 遍历各个集合
        Iterator iterator = vector.iterator();
        System.out.println("遍历向量中的元素：");
        show(iterator);

        System.out.println("\n\n遍历序列中元素");
        show(list.iterator());

        System.out.println("\n\n遍历栈中元素：");
        show(stack.iterator());
    }

    private static void show(Iterator iterator) {
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }

}
