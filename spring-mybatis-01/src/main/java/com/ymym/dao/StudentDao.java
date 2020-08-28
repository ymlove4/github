package com.ymym.dao;

import com.ymym.domain.Student;

import java.util.List;

/**
 * @author ymyoo
 * @date 2020-08-26 20:30
 */
public interface StudentDao {
    int inserStudent(Student student);
    List<Student> selectStudents();

}
