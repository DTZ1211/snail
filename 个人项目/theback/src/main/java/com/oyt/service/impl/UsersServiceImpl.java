package com.oyt.service.impl;

import com.oyt.dao.UsersMapper;
import com.oyt.entity.Users;
import com.oyt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int deleteByPrimaryKey(Integer u_id) {
        return usersMapper.deleteByPrimaryKey(u_id);
    }

    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    @Override
    public Users selectByPrimaryKey(Integer u_id) {
        return null;
    }

    @Override
    public List<Users> selectAll() {
        return usersMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return 0;
    }

    @Override
    public Users login(Users users) {
        return usersMapper.login(users);
    }
}
