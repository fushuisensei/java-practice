package com.atguigu.mybatis;

import com.atguigu.mybatis.Utils.SqlSessionUtil;
import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;


public class ParameterTest {
    @Test
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("admin");
        System.out.println(user);
    }

    @Test
    public void checkLogin() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkUserLogin("admin", "123");
        System.out.println(user);
    }

    @Test
    public void testcheckLoginByMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> Map = new HashMap<String, Object>();
        Map.put("username", "admin");//将参数使用map的方式，也就是键值对进行存储
        Map.put("password", "123");
        User user = mapper.checkLoginByMap(Map);
        System.out.println(user);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "root", "123456", 33, "女", "123@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }

    @Test
    public void checkLoginByParam() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("admin2", "123456");
        System.out.println(user);
    }

}
