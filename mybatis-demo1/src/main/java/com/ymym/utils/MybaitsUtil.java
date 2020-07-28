package com.ymym.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ymyoo
 * @date 2020-07-28 18:32
 * @since
 */
public class MybaitsUtil {
    private static SqlSessionFactory factory = null;

    static {
        String resource = "config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        if(factory!=null){
            sqlSession = factory.openSession();
        }
        return sqlSession;

    }
}
