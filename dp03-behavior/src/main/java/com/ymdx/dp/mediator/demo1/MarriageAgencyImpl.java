package com.ymdx.dp.mediator.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MarriageAgencyImpl
 * @Description: 婚姻中介所实现类
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-10-10 15:45
 * @Version: 1.0.1
 **/
public class MarriageAgencyImpl implements MarriageAgency {

    // 男会员
    private List<Man> men = new ArrayList<>();
    // 女会员
    private List<Woman> women = new ArrayList<>();

    @Override
    public void pair(Person person) {
        if(person.sex == Sex.MALE){
            for(Woman w : women){
                if(w.age == person.requestAge){
                    System.out.println(person.name + "和" + w.name + "配对成功");
                    return;
                }
            }
        }else if(person.sex == Sex.FEMALE){
            for(Man m : men){
                if(m.age == person.requestAge){
                    System.out.println(person.name + "和" + m.name + "配对成功");
                    return;
                }
            }
        }
        System.out.println("没有为" + person.name + "找到合适的对象");
    }

    @Override
    public void register(Person person) {
        if(person.sex == Sex.MALE){
            men.add((Man) person);
        }else{
            women.add((Woman) person);
        }
    }

}
