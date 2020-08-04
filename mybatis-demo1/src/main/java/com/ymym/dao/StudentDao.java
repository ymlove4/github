package com.ymym.dao;

import com.ymym.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ymyoo
 * @date 2020-07-28 18:12
 * @since
 */
public interface StudentDao {

    List<Student> selectStudents();
}
