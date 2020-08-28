package com.ymym.yo03;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ymyoo
 * @date 2020-08-04 19:14
 */

@Data
@Component("mySchool")
public class School {
    @Value("北京大学")
    private String name;
    @Value("北京海淀区")
    private String position;
}
