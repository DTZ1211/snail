package com.oyt.dao;

import com.oyt.entity.Users;
import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer u_id);

    int insert(Users record);

    Users selectByPrimaryKey(Integer u_id);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);

    Users login(Users users);
}