package com.ymdx.dp.memento.demo1;

/**
 * @ClassName: Test
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 17:28
 * @Version: 1.0.1
 **/
public class Test {

    public static void main(String[] args) {
        VersionControlSystem vcs = new VersionControlSystem();
        Document document = new Document();

        document.content = "content1";
        document.otherContent = "otherContent1";
        System.out.println(document);

        // 保存备份
        vcs.add(document.save());

        document.content = "content2";
        document.otherContent = "otherContent2";
        System.out.println(document);

        // 保存备份
        vcs.add(document.save());

        document.content = "content3";
        document.otherContent = "otherContent3";
        System.out.println(document);

        // 恢复版本1
        document.resume(vcs.get(1));
        System.out.println(document);

        // 恢复最新版本
        document.resume(vcs.getLastVersion());
        System.out.println(document);
    }

}
