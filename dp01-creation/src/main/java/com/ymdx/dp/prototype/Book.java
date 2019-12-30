package com.ymdx.dp.prototype;

import java.util.ArrayList;

/**
 * @ClassName: Book
 * @Description: 图书类
 *
 * 克隆必须实现Cloneable接口，默认浅克隆，只对基本类型数据生效。
 * 引用类型变量在浅克隆完成后，被拷贝的原变量和拷贝后的结果变量仍然共用同一个内存地址。
 * 如果需要引用类型的变量也能完成克隆的效果，那么需要深拷贝，即将引用类型的变量重新克隆一下。
 *
 * 注：String是被final修饰的引用类型，不能被修改，即克隆不会修改原来数据
 *
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 16:55
 * @Version: 1.0
 **/
public class Book implements Cloneable {

    private String name;
    private int pageSize;
    private ArrayList<String> images = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public void addImg(String img){
        this.images.add(img);
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        // 默认浅拷贝
        Book book = (Book) super.clone();
        // 深拷贝
        book.images = (ArrayList<String>) this.images.clone();
        return book;
    }
}
