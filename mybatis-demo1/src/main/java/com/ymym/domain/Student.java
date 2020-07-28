package com.ymym.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ymyoo
 * @date 2020-07-28 18:08
 * @since
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String sex;
    private String pwd;

}
