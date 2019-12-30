package com.ymdx.dp.interpreter.demo1;

/**
 * @ClassName: Variable
 * @Description: 算术表达式中的变量
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 10:32
 * @Version: 1.0.1
 **/
public class Variable implements ArithmeticExpression {

    @Override
    public int interpret(Variables variables) {
        return variables.get(this);
    }

}
