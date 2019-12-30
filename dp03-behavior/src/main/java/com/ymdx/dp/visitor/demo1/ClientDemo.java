package com.ymdx.dp.visitor.demo1;

/**
 * @ClassName: ClientDemo
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 09:33
 * @Version: 1.0.1
 **/
public class ClientDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerVisitor typeVisitor = new TypeVisitor();
        ComputerVisitor runVisitor = new RunVisitor();
        computer.accept(typeVisitor);
        System.out.println("-------------------------");
        computer.accept(runVisitor);
    }

}
