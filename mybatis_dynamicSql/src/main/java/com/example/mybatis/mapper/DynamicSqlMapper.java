package com.example.mybatis.mapper;

import com.example.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
//Mybatis框架的动态SQL技术是一种根据特定条件动态拼装SQL语句的功能，它存在的意义是为了
//
//        解决 拼接SQL语句字符串时的痛点问题。

//          where和if一般结合使用：
//
//        a>若where标签中的if条件都不满足，则where标签没有任何功能，即不会添加where关键字
//
//        b>若where标签中的if条件满足，则where标签会自动添加where关键字，并将条件最前方多余的
//
//        and去掉
//
//        注意：where标签不能去掉条件最后多余的and
//choose、when、 otherwise相当于if...else if..else
public interface DynamicSqlMapper {
    List<Emp> getEmpByCondition(Emp emp);
    List<Emp> getEmpByChoose(Emp emp);
    void insertMoreEmp(@Param("emps") List<Emp> emps);
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);

}
