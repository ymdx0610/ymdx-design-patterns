package com.ymdx.dp.memento.demo1;

/**
 * @ClassName: Document
 * @Description: 需要被纳入版本控制系统的文档类
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:18
 * @Version: 1.0.1
 **/
public class Document {

    // 需要备份的内容
    String content;
    // 不需要备份的内容
    String otherContent;

    // 保存为一个备份
    public Backup save(){
        System.out.println("保存备份");
        return new Backup(content);
    }

    // 恢复为某个备份内容
    public void resume(Backup backup){
        System.out.println("恢复备份");
        content = backup.content;
    }

    @Override
    public String toString() {
        return "content:" + content + ",otherContent:" + otherContent;
    }
}
