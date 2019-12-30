package com.ymdx.dp.prototype;

/**
 * @ClassName: Main
 * @Description: 原型模式测试主方法
 *
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 16:58
 * @Version: 1.0
 **/
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book();
        book1.setPageSize(500);
        book1.setName("图书1");
        book1.addImg("图片1");
        System.out.println(book1.getPageSize() + ", " + book1.getName() + ", " + book1.getImages());
        System.out.println("-----------------------");

        Book book2 = book1.clone();
        book2.setName("图书2");
        book2.setPageSize(501);
        book2.addImg("图片2");
        System.out.println(book2.getPageSize() + ", " + book2.getName() + ", " + book2.getImages());
        System.out.println(book1 == book2);
        System.out.println("-----------------------");

        System.out.println(book1.getPageSize() + ", " + book1.getName() + ", " + book1.getImages());
    }

}
