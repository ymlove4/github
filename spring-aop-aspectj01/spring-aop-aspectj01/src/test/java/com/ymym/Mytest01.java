package com.ymym;

import com.ymym.yo01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ymyoo
 * @date 2020-08-06 20:32
 */
public class Mytest01 {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);

        SomeService sser = (SomeService) act.getBean("SomeService");

        System.out.println("sser"+sser.getClass().getName());
        sser.doSome("lisi",19);
    }
}
