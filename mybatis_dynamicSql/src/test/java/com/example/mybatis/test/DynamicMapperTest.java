package com.example.mybatis.test;

import com.example.mybatis.mapper.DynamicSqlMapper;
import com.example.mybatis.pojo.Emp;
import com.example.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DynamicMapperTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        Emp emp =new Emp(null,"张三",20,"男");
        List<Emp> list =mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }
//    getEmpByChoose
@Test
public void testgetEmpByChoose(){
    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
    Emp emp =new Emp(null,"张三",20,"男");
    List<Emp> list =mapper.getEmpByChoose(emp);
    list.forEach(System.out::println);
}
@Test
    public void testinsertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        Emp emp1 =new Emp(null,"张2",28,"男");
        Emp emp2 =new Emp(null,"张1",24,"男");
        Emp emp3 =new Emp(null,"张三2",20,"男");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(list);
        list.forEach(System.out::println);
    }
    @Test
    public void testdeleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        Integer [] empIds =new Integer[]{6,7};

        mapper.deleteMoreEmp(empIds);

    }
}
