package com.ymdx.dp.memento.demo1;

import java.util.LinkedList;

/**
 * @ClassName: VersionControlSystem
 * @Description: 版本控制系统
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:24
 * @Version: 1.0.1
 **/
public class VersionControlSystem {

    // 所有的备份
    LinkedList<Backup> backups = new LinkedList<>();
    // 下一个版本
    int nextVersion;

    // 添加备份
    public void add(Backup backup){
        backup.version = ++nextVersion;
        backups.add(backup);
    }

    // 取得某个版本的备份
    public Backup get(int version){
        for(Backup backup : backups){
            if(backup.version == version){
                return backup;
            }
        }
        return null;
    }

    // 取得最后一个版本的备份
    public Backup getLastVersion(){
        return backups.getLast();
    }

}
