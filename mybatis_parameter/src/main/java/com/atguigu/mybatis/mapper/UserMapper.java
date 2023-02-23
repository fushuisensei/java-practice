package com.atguigu.mybatis.mapper;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.Map;

//MyBatis获取参数值的两种方式：**${}**和**#{}**
//        ${}的本质就是字符串拼接，#{}的本质就是占位符赋值
//        ${}使用字符串拼接的方式拼接sql，若为字符串类型或日期类型的字段进行赋值时，需要手动加单引号；
//        但是#{}使用占位符赋值的方式拼接sql，此时为字符串类型或日期类型的字段进行赋值时，
//        可以自动添加单引号
//若mapper接口中的方法参数为多个时
//        此时MyBatis会自动将这些参数放在一个map集合中，以arg0,arg1...为键，以参数为值；以
//        param1,param2...为键，以参数为值；
////        因此只需要通过${}和#{}访问map集合的键就可以获取相对应的值，注意${}需要手动加单引号

//      1.   使用@Param注解会有两种方式进行存储
//         （1） @Param注解的value属性值为键，以参数为值；以
//         （2）param1,param2...为键，以参数为值；只需要通过${}和#{}访问map集合的键就可以获取相对应
//        的值，
//      2.      若mapper接口中的方法参数为实体类对象时
//              此时可以使用${}和#{}，通过访问实体类对象中的属性名获取属性值，注意${}需要手动加单引号
public interface UserMapper {
    User getUserByUsername(String username);
    User checkUserLogin(String username,String password);
    User checkLoginByMap(HashMap<String, Object> Map);
    void insertUser(User user);
    User checkLoginByParam(@Param("username") String username,@Param("password") String password);


}
