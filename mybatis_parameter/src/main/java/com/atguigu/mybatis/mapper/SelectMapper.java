package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

//当查询的数据为多条时，不能使用实体类作为返回值，否则会抛出异常
//TooManyResultsException；但是若查询的数据只有一条，可以使用实体类或集合作为返回值
/**
 * 查询用户的总记录数
 * @return
 * 在MyBatis中，对于Java中常用的类型都设置了类型别名
 * 例如： java.lang.Integer-->int|integer
 * 例如： int-->_int|_integer
 * 例如： Map-->map,List-->list
 */
/**
 * 查询所有用户信息为map集合
 * @return
 * 将表中的数据以map集合的方式查询，一条数据对应一个map；若有多条数据，就会产生多个map集合，此
时可以将这些map放在一个list集合中获取
 */
/**
 * 查询所有用户信息为map集合
 * @return
 * 将表中的数据以map集合的方式查询，一条数据对应一个map；若有多条数据，就会产生多个map集合，并
且最终要以一个map的方式返回数据，此时需要通过@MapKey注解设置map集合的键，值是每条数据所对应的
map集合
 */
public interface SelectMapper {
    User getUserById(@Param("id") Integer id);
    List <User> getAllUser();
    Integer getCount();
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);
//    List<Map<String,Object>> getAllUserToMap();
    @MapKey("id")
    Map<String,Object> getAllUserToMap();
}

