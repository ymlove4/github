package com.ymym;

import com.ymym.dao.StudentDao;
import com.ymym.dao.impl.StudentDaoImpl;
import com.ymym.domain.Student;
import org.junit.Test;

import java.util.List;

/**
 * @author ymyoo
 * @date 2020-07-28 18:48
 * @since
 */
public class TestMybatis {


    @Test
    public void testSelectStudents(){
        StudentDao Dao = new StudentDaoImpl();
        List<Student> students = Dao.selectStudents();
        for (Student student : students) {
            System.out.println(student);

        }
    }
}
