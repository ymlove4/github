// package com.ymym.demo;
//
// import com.ymym.entity.Student;
// import org.apache.ibatis.session.SqlSession;
// import org.apache.ibatis.session.SqlSessionFactory;
// import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
// import java.io.InputStream;
//
// /**
//  * @author ymyoo
//  * @date 2020-07-26 13:36
//  * @since
//  */
// // public class Demo01 {
// //
// //     public static void main(String[] args) {
// //         //加载mybaits配置文件
// //         InputStream resourceAsStream = Demo01.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
// //         SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
// //         SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
// //         SqlSession sqlSession = build.openSession();
// //         String stata = "com.ymym.mapper.StudenMapper.save";
// //         Student student = new Student(5L,"可乐","男","2323");
// //         sqlSession.insert(stata,student);
// //         sqlSession.commit();
// //         sqlSession.close();
// //
// //
// //     }
// // }
