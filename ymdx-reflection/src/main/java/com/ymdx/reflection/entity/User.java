package com.ymdx.reflection.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: User
 * @Description: 用户对象
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-25 15:36
 * @Version: 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String code;
    private String name;
    private String password;

    private void show(String str){
        System.out.println("hello, ymdx! --- request str:" + str);
    }

}
