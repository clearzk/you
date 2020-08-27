package com.clear.you.validation;

import com.clear.you.common.Result;
import com.clear.you.util.ResultUtil;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/valid",produces = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ValidController {

    @RequestMapping("/test")
    public Result test(@RequestBody @Validated ValidUser validUser) {
        System.out.println("valid pass");
        return ResultUtil.success(validUser);
    }
}
