package com.ctsi.protest.service;

import com.ctsi.protest.domain.TUser;
import org.springframework.stereotype.Service;

@Service
public class TUserService {

    public TUser getUser() {
        return new TUser(1, 1, "张三", 23, 1);
    }

    public TUser updeteUser(TUser user) {
        return new TUser(2, 2, "李四", 23, 1);
    }

    public int deleteUser(Integer user_id) {
        return 1;
    }
}
