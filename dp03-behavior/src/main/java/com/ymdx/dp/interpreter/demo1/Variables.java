package com.ymdx.dp.interpreter.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Variables
 * @Description: 使用Map存储各个变量的值
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-11 10:33
 * @Version: 1.0.1
 **/
public class Variables {

    Map<Variable, Integer> v = new HashMap<>();

    public void put(Variable variable, int value){
        v.put(variable, value);
    }

    public int get(Variable variable){
        return v.get(variable);
    }

}
