package com.ctsi.protest.mapper;

import com.ctsi.protest.domain.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TUserMapper {

    @Select("SELECT * FROM t_user WHERE user_id = #{user_id}")
    TUser getUser(Integer user_id);
    int a = 0;

    TUser saveTUser();
}
