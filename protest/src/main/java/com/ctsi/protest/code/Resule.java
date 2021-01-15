package com.ctsi.protest.code;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Resule<T> {

    private String code;
    private String msg;
    private T data;
}
