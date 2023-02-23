package com.atguigu.mybatis.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    public  static SqlSession getSqlSession(){
        SqlSession sqlSession=null;
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取SqlseesionFactory对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(is);
            //获取Sqlsession对象
            sqlSession=sqlSessionFactory.openSession(true);
            //sqlSession.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }
}
