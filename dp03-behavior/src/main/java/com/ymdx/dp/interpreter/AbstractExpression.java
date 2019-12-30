package com.ymdx.dp.interpreter;

/**
 * @ClassName: AbstractExpression
 * @Description: 抽象表达式
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 10:19
 * @Version: 1.0.1
 **/
public abstract class AbstractExpression {

    // 每个表达式必须有一个解析任务
    public abstract Object interpreter(Context ctx);

}
