package com.atguigu.mybatis;

import com.atguigu.mybatis.Utils.SqlSessionUtil;
import com.atguigu.mybatis.mapper.SpecialSqlMapper;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SpecialSqlMapperTest {
    @Test
    public void testGetSpecialSql() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        List<User> specialSql = mapper.getSpecialSql("a");
        specialSql.forEach(System.out::println);
    }

    @Test
    public void testDeleteSpecialSql() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        mapper.deleteId("3,4");
    }

    @Test
    public void testInsertToUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        User user = new User(null, "xiaopeng", "12345678", 28, "男", "140@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }
}