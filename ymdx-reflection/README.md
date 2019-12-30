## 义码当先之反射机制

### 什么是Java反射
可以理解为正在运行的程序能够动态地获取某个类的所有信息。  

### 反射机制的作用
1. 反编译：.class --> .java  
2. 通过反射机制访问java对象的属性，方法，构造方法等  

### 反射机制的应用场景
Jdbc 加载驱动、Spring IOC，Hibernate、Mybatis、JPA等开源框架...    
 
### 反射机制获取类有三种方式
```java
// 第一种方式                                                         
Class<?> cls1 = Class.forName("com.ymdx.reflection.entity.User");
User user1 = (User) cls1.newInstance();                                                                
                                                                 
// 第二种方式：Java中每个类类型都有class属性                                     
Class<User> cls2 = User.class;                                   
User user2 = cls2.newInstance();                                                                  
                                                                 
// 第三种方式：Java语言中任何一个java对象都有getClass方法                           
User user = new User();                                          
Class<? extends User> cls3 = user.getClass();                    
User user3 = cls3.newInstance();                                                                       
```

### 反射创建对象的方式
```java
 Class<?> cls = Class.forName("com.ymdx.reflection.entity.User");
// 方式一：调用类默认的无参构造方法
User user1 = (User) cls.newInstance();
System.out.println(user1);

// 方式二：调用类的带参数的构造方法
Constructor<?> constructor = cls.getConstructor(Long.class, String.class, String.class, String.class);
User user2 = (User) constructor.newInstance(1L, "1001", "ymdx", "123456");
System.out.println(user2);
```

### 反射常用API

|方法名称|作用|
|:----|:----|
|getDeclaredMethods()|获取该类的所有方法|
|getReturnType()|获取该类的返回值|
|getParameterTypes()|获取传入参数|
|getDeclaredFields()|获取该类的所有字段|
|setAccessible|允许访问私有成员|

### 使用反射为类私有属性赋值
```java
Class<?> cls = Class.forName("com.ymdx.reflection.entity.User");
// 获取类的所有属性
Field[] declaredFields = cls.getDeclaredFields();
Arrays.asList(declaredFields).stream().forEach(field -> {
    System.out.println(field.getName());
});
System.out.println("-------------");

// 获取类的所有方法
Method[] declaredMethods = cls.getDeclaredMethods();
Arrays.asList(declaredMethods).stream().forEach(metod -> {
    System.out.println(metod.getName());
});
System.out.println("-------------");

// 初始化对象
User user = (User) cls.newInstance();
// 获取私有id属性
Field field = cls.getDeclaredField("id");
// 开放访问权限
field.setAccessible(true);
// 给私有属性赋值
field.set(user, 1L);
System.out.println("使用反射值给私有id属性赋值，赋值后的id为：" + user.getId());
System.out.println("-------------");

// 获取私有show方法
Method method = cls.getDeclaredMethod("show", String.class);
// 开放访问权限
method.setAccessible(true);
// 调用私有方法
method.invoke(user, "123");
```

### JDBC反射加载驱动  
```java
public class JdbcDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/ymdx_test", "root", "123456");
        // 3.创建sql预处理对象
        PreparedStatement ps = conn.prepareStatement("insert into t_user(code, name, password) values (?, ?, ?)");
        // 4.传递sql参数，注意下标从1开始
        ps.setString(1, "test_001");
        ps.setString(2, "test_001");
        ps.setString(3, "test_001");
        // 5.执行
        ps.executeUpdate();
        // 6.获取查询结果集对象
        ResultSet rs = ps.executeQuery("select * from t_user");
        while (rs.next()){
            System.out.println("id=" + rs.getLong(1) + ";code=" + rs.getString(2) + ";name=" + rs.getString(3) + ";password=" + rs.getString(4));
        }
        // 7.关闭连接资源
        rs.close();
        ps.close();
        conn.close();
    }

}
```
