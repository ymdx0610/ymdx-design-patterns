package com.ymdx.dp.responsibility_chain.demo1;

/**
 * @ClassName: DrumBeater
 * @Description: 击鼓者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 11:48
 * @Version: 1.0.1
 **/
public class DrumBeater {

    public static void main(String[] args) {
        // 创建一个链
        Player player = new PlayerA(new PlayerB(new PlayerC( new PlayerD(null))));
        // 击鼓3下停止
        player.handle(3);
    }

}
