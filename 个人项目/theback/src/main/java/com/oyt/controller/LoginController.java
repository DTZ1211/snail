package com.oyt.controller;

import com.oyt.entity.Users;
import com.oyt.service.UsersService;
import com.oyt.vo.Constants;
import com.oyt.vo.JSONResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UsersService usersService;

    @PostMapping
    public JSONResponse checkUser(@RequestBody Users users){
        Users login = usersService.login(users);
        if (login != null){
            return JSONResponse.OK(Constants.SUCCESS_200, login);
        }
        return JSONResponse.ERROR(Constants.ERROR_400, "用户信息错误！");
    }

}
