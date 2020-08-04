package com.ymym.yo01;

import jdk.jfr.SettingDefinition;
import lombok.Data;
import lombok.Setter;
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
@Data
@Component(value = "myStudent")
public class Student {
    private String name;
    private Integer age;
}
