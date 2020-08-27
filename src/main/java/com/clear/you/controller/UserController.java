package com.clear.you.controller;

import com.clear.you.common.Result;
import com.clear.you.model.User;
import com.clear.you.service.UserService;
import com.clear.you.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.*;
import sun.nio.ch.IOUtil;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.InputStream;

@RestController
@Api(value = "用户控制器")
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private ResourceLoader resourceLoader;

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

    @ApiOperation("excel模板下载")
    @GetMapping(value = "download")
    public void download(HttpServletResponse response)throws Exception {
        String path="classpath:excel/模板.xlsx";
        int lastIndexOf = path.lastIndexOf("/");
        String fileName = path.substring(lastIndexOf+1);
        ServletOutputStream outputStream = response.getOutputStream();
        InputStream inputStream = resourceLoader.getResource(path).getInputStream();

        response.setContentType("application/vnd.ms-excel;charset=UTF-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + java.net.URLEncoder.encode(fileName,"UTF-8"));
        byte[] b=new byte[1024];
        int len=0;
        while ((len = inputStream.read(b,0,b.length)) != -1) {
            outputStream.write(b,0,len);
        }

        outputStream.close();

    }
}
