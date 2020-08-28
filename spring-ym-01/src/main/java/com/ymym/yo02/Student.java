package com.ymym.yo02;

import lombok.Data;
import lombok.ToString;
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

    /**
     * @value :简单类型的属性赋值
     *    属性 ：value是string类型的，表示简单类型的属性值
     *    位置 :1.在属性定义的上面，无需set方法
     *         2.在set方法的上面
     *
     */
    @Value("张飞")
    private String name;
    @Value("22")
    private Integer age;

    //
    // @Value("22")
    // public void setAge(Integer age) {
    //     this.age = age;
    // }
}
