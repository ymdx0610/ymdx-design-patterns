package com.ymdx.dp01;

/**
 * @ClassName: EnumSingleton
 * @Description: 枚举单例模式
 * <p>
 * 优点：实现简单、枚举本身就是单例，由jvm从根本上提供保障！避免通过反射和反序列化的漏洞
 * 缺点：没有延迟加载
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-26 11:05
 * @Version: 1.0
 **/
public class EnumSingleton {

    private EnumSingleton(){
        System.out.println("初始化...");
    }

    public static EnumSingleton getInstance() {
        return MyEnum.INSTANCE.getInstance();
    }

    private enum MyEnum {
        INSTANCE;
        private EnumSingleton instance = null;

        private MyEnum() {
            instance = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return instance;
        }
    }

    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.getInstance();
        EnumSingleton instance2 = EnumSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }


}
