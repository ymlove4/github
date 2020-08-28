package com.ymym.yo04;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;

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
     * @Autowired :spring框架提供的注解，实现应用类型的赋值
     * 使用的是自动注入原理，支持byName，byType
     * 默认使用的是buType自动注入
     *
     * 位置：1）在属性定义的上面，无需set方法（推荐）
     *      2）在set方法上面
     *
     * 如果使用byName方式，需要步骤：
     * ①在属性上面加入@Autowired
     * ②在属性上面加入@Qualifier(value ="bean的id")：表示使用指定名称的bean完成赋值
     */
    @Autowired
    @Qualifier("mySchool")
    private School school;
}
