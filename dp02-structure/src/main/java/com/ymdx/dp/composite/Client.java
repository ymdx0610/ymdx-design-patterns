package com.ymdx.dp.composite;

/**
 * @ClassName: Client
 * @Description: 测试应用
 * @Author: ymdx
 * @Email: y_m_d_x@163.com
 * @Date: 2019-09-30 14:47
 * @Version: 1.0.1
 **/
public class Client {

    public static void main(String[] args) {
        // 创建一个根节点
        Composite root = new Composite();
        root.operation();
        // 创建树枝节点
        Composite branch = new Composite();
        // 创建叶子节点
        Leaf leaf = new Leaf();
        // 构件树形结构
        root.add(branch);
        branch.add(leaf);

        display(root);
    }

    public static void display(Composite root){
        for(Component c : root.getChild()){
            // 如果节点类型是叶子节点
            if(c instanceof Leaf){
                c.operation();
            }else{// 树枝节点
                c.operation();
                // 递归调用
                display((Composite) c);
            }
        }
    }


}
