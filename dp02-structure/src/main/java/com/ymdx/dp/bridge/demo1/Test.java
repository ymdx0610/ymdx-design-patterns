package com.ymdx.dp.bridge.demo1;

/**
 * @ClassName: Test
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 13:14
 * @Version: 1.0.1
 **/
public class Test {

    public static void main(String[] args) {
        Color color = new Green();
        AbstractShape shape = new Square(color);
        shape.draw();
    }

}
