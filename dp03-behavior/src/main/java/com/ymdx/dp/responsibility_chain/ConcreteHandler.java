package com.ymdx.dp.responsibility_chain;

/**
 * @ClassName: ConcreteHandler
 * @Description: 具体处理者
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 11:32
 * @Version: 1.0.1
 **/
public class ConcreteHandler extends Handler {

    // 处理请求
    @Override
    public void handleRequest() {
        if(getSuccessor() != null){
            System.out.println("请求传递给" + getSuccessor());
            getSuccessor().handleRequest();
        }else {
            System.out.println("请求处理");
        }
    }

}
