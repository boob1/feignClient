package com.hongda.customera.controller;

import com.hongda.customera.domain.base.Result;
import com.hongda.customera.domain.vo.UserVO;
import com.hongda.customera.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author liuyibo
 * @Date 2024/5/23 11:37
 **/
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user/findByName/{name}")
    public Result findByName(@PathVariable String name) {
        return Result.success(userService.findByName(name));
    }
}
