package com.ymdx.dp.adaptor;

/**
 * @ClassName: Main
 * @Description: 适配器模式测试主方法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 11:37
 * @Version: 1.0
 **/
public class Main {

    public static void main(String[] args) {
        CN220VInterface cn220VInterface = new CN220VInterfaceImpl();
        PowerAdaptor powerAdaptor = new PowerAdaptor(cn220VInterface);
        // 电饭煲
        ElectricCooker cooker = new ElectricCooker(powerAdaptor);
        // 使用了适配器，在220V的环境可以工作了。
        cooker.cook();
    }

}
