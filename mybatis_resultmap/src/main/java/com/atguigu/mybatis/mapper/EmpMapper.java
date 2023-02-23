package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;
//若字段名和实体类中的属性名不一致，但是字段名符合数据库的规则（使用_），实体类中的属性
//        名符合Java的规则（使用驼峰）
//        此时也可通过以下两种方式处理字段名和实体类中的属性的映射关系
//        a>可以通过为字段起别名的方式，保证和实体类中的属性名保持一致
//        b>可以在MyBatis的核心配置文件中设置一个全局配置信息mapUnderscoreToCamelCase，可
//        以在查询表中数据时，自动将_类型的字段名转换为驼峰
//        例如：字段名user_name，设置了mapUnderscoreToCamelCase，此时字段名就会转换userName
import java.util.List;

public interface EmpMapper {
    Emp getEmpByEmpId(@Param("empId") Integer empid);
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);
    Emp getEmpAndDeptByStep(@Param("empId") Integer empId);
    List <Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
