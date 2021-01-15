package com.ctsi.protest.web;

import com.ctsi.protest.domain.TUser;
import com.ctsi.protest.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TUserController {

    @Autowired
    private TUserService tUserService;

    @GetMapping("/getUser")
    public TUser getUser() {
        return tUserService.getUser();
    }
}
