package com.ymym.service;

import com.ymym.dao.StudentDao;
import com.ymym.domain.Student;

import java.util.List;

/**
 * @author ymyoo
 * @date 2020-08-26 20:55
 */
public class StudentServiceImpl implements StudentService {

    //应用类型
    private StudentDao studentDao;

    //使用set注入，赋值
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int i = studentDao.inserStudent(student);
        return i;
    }

    @Override
    public List<Student> queryStudent(){
        List<Student> students = studentDao.selectStudents();
        return students;
    }
}
