package com.clear.you.service;

import com.clear.you.common.Result;
import com.clear.you.model.User;
import com.clear.you.util.ResultUtil;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser() {
        User u=new User(26,"zk","芜湖");
        return u;
    }

    public Result<User> edit(User user) {
        return ResultUtil.success(user);
    }
}
