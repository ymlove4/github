package com.ymym;

import com.ymym.dao.StudentDao;
import com.ymym.domain.Student;
import com.ymym.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author ymyoo
 * @date 2020-08-26 21:57
 */
public class MyTest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext cex = new ClassPathXmlApplicationContext(config);
        String[] nas = cex.getBeanDefinitionNames();
        for (String s : nas) {
            System.out.println(s);
        }
    }
    @Test
    public void testDaoInsert(){
        String config = "applicationContext.xml";
        ApplicationContext cex = new ClassPathXmlApplicationContext(config);
        //获取spring容器中dao的对象
        StudentDao dao = (StudentDao) cex.getBean("studentDao");
        Student student = new Student();
        student.setId(7);
        student.setName("布罗利超赛");
        student.setSex("男");
        student.setPwd("123");
        int i = dao.inserStudent(student);
        System.out.println(i);

    }
    @Test
    public void testServiceInsert(){
        String config = "applicationContext.xml";
        ApplicationContext cex = new ClassPathXmlApplicationContext(config);
        //获取spring容器中dao的对象
        StudentService service = (StudentService) cex.getBean("studentService");
        Student student = new Student();
        student.setId(8);
        student.setName("超蓝贝吉塔");
        student.setSex("男");
        student.setPwd("12345");
        int i = service.addStudent(student);
        System.out.println(i);
    //spring和mybatis整合 会自动提交事务
    }
    @Test
    public void testServiceSelect(){
        String config = "applicationContext.xml";
        ApplicationContext cex = new ClassPathXmlApplicationContext(config);
        //获取spring容器中dao的对象
        StudentService service = (StudentService) cex.getBean("studentService");
        List<Student> students = service.queryStudent();
        for (Student stu : students) {
            System.out.println(stu);

        }

    }

}
