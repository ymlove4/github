package com.ymym;

import com.ymym.dao.StudentDao;
import com.ymym.domain.Student;
import com.ymym.utils.MybaitsUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ymyoo
 * @date 2020-07-28 18:48
 * @since
 */
public class TestMybatis {


    @Test
    public void testSelectStudents() {
        SqlSession sqlSession = MybaitsUtil.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        List<Student> students = mapper.selectStudents();
        for (Student student : students) {
            System.out.println("学生信息="+student);
        }

    }
}



