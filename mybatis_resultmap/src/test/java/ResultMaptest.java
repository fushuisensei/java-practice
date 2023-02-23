import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.atguigu.mybatis.mapper.EmpMapper;

import com.atguigu.mybatis.pojo.Emp;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;

public class ResultMaptest {
    @Test
    public void testGetEmpByEmpId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpByEmpId(1);
        System.out.println(empByEmpId);

    }
    @Test
    public void testGetEmpByEmpIdAndDeptByEmpId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDeptByEmpId = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(empAndDeptByEmpId);

    }
    @Test
    public void testGetEmpAndDeptByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDeptByStep = mapper.getEmpAndDeptByStep(2);
        System.out.println(empAndDeptByStep);

    }
    @Test
    public void testempAndDeptResultMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(deptAndEmpByDeptId);

    }
    @Test
    public void testgetDeptAndEmpByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(dept.getDeptName());

    }
}
