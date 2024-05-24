package com.hongda.customera.service;

import com.hongda.customera.domain.base.Result;
import com.hongda.customera.domain.vo.UserVO;
import com.hongda.customera.feign.UserFeignService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author liuyibo
 * @Date 2024/5/23 11:40
 **/
@Service
public class UserServiceImpl  implements UserService{
    @Resource
    UserFeignService userFeignService;
    @Override
    public Result findByName(String name) {
        return userFeignService.findByName(name);
    }
}
