package com.ymym.demo;

import com.ymym.entity.User;
import com.ymym.repository.UserRepository;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ymyoo
 * @date 2020-07-28 13:14
 * @since
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
    //     InputStream inputStream = Demo02.class.getResourceAsStream("mybatis-config.xml");
    //     SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    //     SqlSessionFactory build = sqlSessionFactoryBuilder.build(inputStream);
    //     SqlSession sqlSession = build.openSession();
    //     //获取接口的实例对象
    //     UserRepository mapper = sqlSession.getMapper(UserRepository.class);
    //     List<User> all = mapper.findAll();
    //     for (User user : all) {
    //         System.out.println(user);
    //     }
    //

        String config ="mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        UserRepository mapper = sqlSession.getMapper(UserRepository.class);
        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        sqlSession.close();

    }
}
