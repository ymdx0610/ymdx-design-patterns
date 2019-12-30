package com.ymdx.dp.singleton.demo1;

/**
 * @ClassName: GlobalNumDemo
 * @Description: 测试使用单例模式记录访问次数
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-29 10:27
 * @Version: 1.0.1
 **/
public class GlobalNumDemo {

    // 测试单例模式
    public static void main(String[] args) {
        // 创建线程A
        NumThread threadA = new NumThread("线程A");
        // 创建线程B
        NumThread threadB = new NumThread("线程B");

        threadA.start();
        threadB.start();
    }

}

class NumThread extends Thread{
    private String threadName;

    public NumThread(String threadName){
        this.threadName = threadName;
    }

    // 重写线程的run方法（线程任务）
    @Override
    public void run() {
        super.run();

        GlobalNum gnObj = GlobalNum.getInstance();

        // 循环访问，输出访问次数
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName+"第"+gnObj.getNum()+"次访问！");

            try {
                // 线程休眠1000毫秒
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
