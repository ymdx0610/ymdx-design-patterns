package com.ymdx.dp.prototype.demo1;

import java.util.Random;

/**
 * @ClassName: ClientDemo
 * @Description: TODO
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 17:09
 * @Version: 1.0.1
 **/
public class ClientDemo {

    // 发送账单的数量，这个值是从数据库中获取的

    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        // 模拟发送邮件
        int i = 0;
        // 定义一个邮件对象
        Mail mail = new Mail("某商场十一抽奖活动", "十一抽奖通知：凡在十一期间在本商场购物满100元的客户都有获得抽奖机会！...");
        mail.setTail("解释权归某商场所有");

        while(i < MAX_COUNT){
            // 克隆邮件
            Mail cloneMail = mail.clone();
            // 以下是每封邮件不同的地方
            cloneMail.setAppellation(getRandString(5) + " 先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");

            // 发送邮件
            sendMail(cloneMail);
            i++;
        }
    }

    private static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t...发送成功！");
    }

    private static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }


}
