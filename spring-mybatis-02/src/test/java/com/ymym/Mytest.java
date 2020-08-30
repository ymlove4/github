package com.ymym;

import com.ymym.service.Buy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ymyoo
 * @date 2020-08-30 16:03
 */
public class Mytest {

    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Buy buyService = (Buy) ctx.getBean("buyService");

        buyService.buy(1001,20);

    }
}
