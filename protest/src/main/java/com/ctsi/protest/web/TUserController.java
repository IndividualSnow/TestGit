package com.ctsi.protest.web;

import com.ctsi.protest.domain.TUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TUserController {

    @GetMapping("/getUser")
    public TUser getUser() {
        return new TUser(1, 1, "张三", 23, 1);
    }
}
