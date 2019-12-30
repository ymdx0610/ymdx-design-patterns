package com.ymdx.dp.state;

/**
 * @ClassName: Client
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 09:47
 * @Version: 1.0.1
 **/
public class Client {

    public static void main(String[] args) {
        // 定义环境角色
        Context context = new Context();

        // 执行行为
        context.handle1();
        context.handle2();
    }

}
