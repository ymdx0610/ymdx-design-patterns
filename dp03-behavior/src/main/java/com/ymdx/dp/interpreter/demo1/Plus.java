package com.ymdx.dp.interpreter.demo1;

/**
 * @ClassName: Plus
 * @Description: 加法
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 10:36
 * @Version: 1.0.1
 **/
public class Plus implements ArithmeticExpression {

    ArithmeticExpression left;
    ArithmeticExpression right;

    public Plus(ArithmeticExpression left, ArithmeticExpression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Variables variables) {
        return left.interpret(variables) + right.interpret(variables);
    }

}
