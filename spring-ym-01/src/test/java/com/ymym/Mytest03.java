package com.ymym;

import com.ymym.yo03.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ymyoo
 * @date 2020-08-04 17:41
 */
public class Mytest03 {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student student = (Student) context.getBean("myStudent");
        System.out.println(student);

    }
}
