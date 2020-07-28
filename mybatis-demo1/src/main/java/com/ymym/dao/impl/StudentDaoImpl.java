package com.ymym.dao.impl;

import com.ymym.dao.StudentDao;
import com.ymym.domain.Student;
import com.ymym.utils.MybaitsUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author ymyoo
 * @date 2020-07-28 18:30
 * @since
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudents() {
        //获取SqlSession对象
        SqlSession sqlSession = MybaitsUtil.getSqlSession();
        String sqlId ="com.ymym.dao.StudentDao.selectStudents";
        //执行sql语句，使用Sqlsession类的方法
        List<Student> students = sqlSession.selectList(sqlId);
        // for (Student student : students) {
        //     System.out.println(student);
        // }
        sqlSession.close();
        return students;
    }
}
