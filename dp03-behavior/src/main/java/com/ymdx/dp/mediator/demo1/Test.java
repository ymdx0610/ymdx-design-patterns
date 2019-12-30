package com.ymdx.dp.mediator.demo1;

/**
 * @ClassName: Test
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 15:54
 * @Version: 1.0.1
 **/
public class Test {

    public static void main(String[] args) {
        MarriageAgency agency = new MarriageAgencyImpl();
        Person m1 = new Man("John", 20, 18, agency);
        Person m2 = new Man("Mike",27,25, agency);
        Person w1 = new Woman("Mary", 25, 27, agency);
        Person w2 = new Woman("Jane", 20, 22, agency);

        m1.findPartner();
        m2.findPartner();
    }

}
