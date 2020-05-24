package com.clear.you.controller;

import com.clear.you.common.Result;
import com.clear.you.model.User;
import com.clear.you.service.UserService;
import com.clear.you.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Api(value = "用户控制器")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/getUser")
    @ApiOperation(value = "获取用户")
    public User getUser() {
       return  service.getUser();
    }

    @PostMapping(value = "/editUser")
    @ApiOperation(value = "修改用户")
    public Result<User> edit(@Valid @RequestBody User user) {
        return service.edit(user);
    }

    @ApiOperation("测试参数校验")
    @GetMapping(value = "/test")
    public Result testParameter(@RequestParam(value = "name",required = false) String name,@RequestParam(value = "id",required = false) Integer age) {
        return ResultUtil.success();
    }
}

//   000027818  dlxx-区域综合能源
