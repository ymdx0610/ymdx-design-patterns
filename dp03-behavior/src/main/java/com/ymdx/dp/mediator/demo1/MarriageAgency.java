package com.ymdx.dp.mediator.demo1;

/**
 * @ClassName: MarriageAgency
 * @Description: 婚姻中介所接口
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 15:23
 * @Version: 1.0.1
 **/
public interface MarriageAgency {

    // 为person配对
    void pair(Person person);
    // 注册会员
    void register(Person person);

}
