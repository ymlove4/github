package com.ymym.yo04;

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
    @Value("武汉大学")
    private String name;
    @Value("武汉洪山区")
    private String position;
}
