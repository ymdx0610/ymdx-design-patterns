package com.ymdx.dp.adaptor;

/**
 * @ClassName: PowerAdaptor
 * @Description: 电源适配器
 *
 * 要想在中国使用日本电饭煲，需要把电饭煲110v的电源接口适配成我们220V的电源接口，这就需要一个电源适配器
 *
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-12-30 11:36
 * @Version: 1.0
 **/
public class PowerAdaptor implements JP110VInterface{

    private CN220VInterface cn220VInterface;

    public PowerAdaptor(CN220VInterface cn220VInterface) {
        this.cn220VInterface = cn220VInterface;
    }

    @Override
    public void connect() {
        cn220VInterface.connect();
    }

}
