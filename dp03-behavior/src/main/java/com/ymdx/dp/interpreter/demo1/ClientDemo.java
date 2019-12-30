package com.ymdx.dp.interpreter.demo1;

/**
 * @ClassName: ClientDemo
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 10:52
 * @Version: 1.0.1
 **/
public class ClientDemo {

    public static void main(String[] args) {
        Variables v = new Variables();
        Variable x = new Variable();
        Variable y = new Variable();
        Variable z = new Variable();

        v.put(x, 10);
        v.put(y, 20);
        v.put(z, 30);

        // 计算 x * (y + z / x) - x
        ArithmeticExpression e = new Substract(new Multiply(x, new Plus(y, new Division(z, x))), x);

        // 220
        System.out.println(e.interpret(v));
    }

}
