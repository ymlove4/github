package com.ymym.yo03;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ymyoo
 * @date 2020-08-04 17:28
 */


/**
 * @Component ; 创建对象的，value是惟一的对象名称
 *
 *
 */
@ToString
@Component("myStudent")
public class Student {

    @Value("张飞")
    private String name;
    @Value("22")
    private Integer age;

    /**
     * 引用类型
     * @Autowired :
     */
    @Autowired
    private School school;
}
