package com.imooc.controller;

import com.imooc.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/usernameIsExit")
    public int queryUsernameIsExit(@RequestParam String username) {
        //判断用户名不能为空
        if (StringUtils.isBlank(username)) {
            return 500;
        }
        //查找注册的用户名是否存在
        boolean isExist = userService.queryUserNameIsExist(username);
        if (isExist)
            return 500;
        //请求成功，用户名没有重复
        return 200;
    }


}
