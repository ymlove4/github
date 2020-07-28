package com.ymym.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ymyoo
 * @date 2020-07-28 15:10
 * @since
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private long username ;
    private String  pwd;


}
