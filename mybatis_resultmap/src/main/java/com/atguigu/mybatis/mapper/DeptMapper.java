package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);
//    查询部门以及部门中的人员信息
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
