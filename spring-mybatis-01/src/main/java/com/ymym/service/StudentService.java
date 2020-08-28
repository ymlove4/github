package com.ymym.service;

import com.ymym.domain.Student;

import java.util.List;

/**
 * @author ymyoo
 * @date 2020-08-26 20:53
 */
public interface StudentService {

    int addStudent(Student student);
    List<Student> queryStudent();

}
