package com.ymdx.dp.visitor;

/**
 * @ClassName: Client
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:50
 * @Version: 1.0.1
 **/
public class Client {

    public static void main(String[] args) {
        // 创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        // 生成元素
        os.createElements();
        // 创建一个访问者对象
        Visitor visitor = new ConcreteVisitor();

        // 访问者对结构进行访问（执行访问）
        os.action(visitor);
    }

}
