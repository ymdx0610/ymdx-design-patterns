package com.ymdx.dp.facade.demo1;

/**
 * @ClassName: Secretary
 * @Description: 外观角色：秘书类
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-08 13:29
 * @Version: 1.0.1
 **/
public class Secretary {

    private Chauffeur chauffeur = new Chauffeur();
    private Hotel hotel = new Hotel();
    private Restaurant restaurant = new Restaurant();
    private Airport airport = new Airport();

    // 安排出差
    public void trip(String to, int days){
        airport.bookTicket("青岛", to);
        chauffeur.drive("机场");
        hotel.reserve(days);
    }

    // 安排饭局
    public void repast(int num){
        restaurant.reserve(num);
        chauffeur.drive("酒店");
    }

}
