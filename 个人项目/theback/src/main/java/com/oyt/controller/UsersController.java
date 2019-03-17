package com.oyt.controller;

import com.oyt.entity.Users;
import com.oyt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Users> listUser(){
        return userService.selectAll();
    }

    //@RequestMapping(path = "/insert", method = RequestMethod.POST)
    @PostMapping("/insert")
    public int insertUser(@RequestBody Users user){
        return userService.insert(user);
    }

    @RequestMapping(path = "/deluser", method = RequestMethod.DELETE)
    public int deluser(int id){
        return userService.deleteByPrimaryKey(id);
    }

}
