package com.ymdx.dp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Composite
 * @Description: 树枝构件
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-30 14:43
 * @Version: 1.0.1
 **/
public class Composite implements Component{

    // 构件容器
    private List<Component> componentList = new ArrayList<>();

    // 添加构件
    public void add(Component component){
        this.componentList.add(component);
    }

    // 删除构件
    public void remove(Component component){
        this.componentList.remove(component);
    }

    // 获取子构件
    public List<Component> getChild(){
        return this.componentList;
    }

    @Override
    public void operation() {
        // 业务逻辑代码
    }

}
