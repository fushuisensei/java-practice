package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * 添加用户信息
// * @param user
 * @return
 * useGeneratedKeys：设置使用自增的主键
 * keyProperty：因为增删改有统一的返回值是受影响的行数，因此只能将获取的自增的主键放在传输的参数user对象的某个属性中
 */
public interface SpecialSqlMapper {
    List<User> getSpecialSql(@Param("mohu")String mohu);
    void deleteId(@Param("ids")String id);
    void insertUser(User user);
}
