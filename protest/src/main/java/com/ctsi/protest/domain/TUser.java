package com.ctsi.protest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TUser {

    private Integer id;
    private Integer user_id;
    private String user_name;
    private Integer user_age;
    private Integer user_sex; //1:男, 0:女
}
