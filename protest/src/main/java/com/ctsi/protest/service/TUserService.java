package com.ctsi.protest.service;

import com.ctsi.protest.domain.TUser;
import org.springframework.stereotype.Service;

@Service
public class TUserService {

    public TUser getUser() {
        return new TUser(1, 1, "张三", 23, 1);
    }
}
