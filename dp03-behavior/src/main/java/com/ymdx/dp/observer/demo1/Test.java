package com.ymdx.dp.observer.demo1;

/**
 * @ClassName: Test
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 16:39
 * @Version: 1.0.1
 **/
public class Test {

    public static void main(String[] args) {
        Button button = new Button();
        button.color = "白色";

        button.x = 0;
        button.y = 0;

        button.addClickableObserver(new ChangeColorObserver());
        button.addClickableObserver(new ChangeCoordinateObserver());
        button.addClickableObserver(new OtherObserver());

        button.click();
        System.out.println(button);
    }

}
