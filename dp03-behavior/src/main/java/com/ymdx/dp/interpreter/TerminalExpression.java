package com.ymdx.dp.interpreter;

/**
 * @ClassName: TerminalExpression
 * @Description: 终结符表达式
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 10:23
 * @Version: 1.0.1
 **/
public class TerminalExpression extends AbstractExpression {

    // 通常终结符表达式只有一个，但是有多个对象
    @Override
    public Object interpreter(Context ctx) {
        return null;
    }

}
