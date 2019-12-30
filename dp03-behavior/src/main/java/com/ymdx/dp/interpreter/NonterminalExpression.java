package com.ymdx.dp.interpreter;

/**
 * @ClassName: NonterminalExpression
 * @Description: 非终结符表达式
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 10:26
 * @Version: 1.0.1
 **/
public class NonterminalExpression extends AbstractExpression {

    // 每个非终结符表达式都会对其他表达式产生依赖
    public NonterminalExpression(AbstractExpression expression){}

    @Override
    public Object interpreter(Context ctx) {
        // 进行文法处理
        return null;
    }

}
