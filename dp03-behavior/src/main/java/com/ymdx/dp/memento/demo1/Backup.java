package com.ymdx.dp.memento.demo1;

/**
 * @ClassName: Backup
 * @Description: 版本控制系统中保存的每一个备份类
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:19
 * @Version: 1.0.1
 **/
public class Backup {

    // 备份的内容
    String content;
    // 版本
    int version;

    public Backup(String content){
        this.content = content;
    }


}
