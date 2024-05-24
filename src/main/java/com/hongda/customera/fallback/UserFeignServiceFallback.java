package com.hongda.customera.fallback;

import com.hongda.customera.domain.base.Result;
import com.hongda.customera.domain.vo.UserVO;
import com.hongda.customera.feign.UserFeignService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @ClassName UserFeignServiceFallback
 * @Description TODO
 * @Author liuyibo
 * @Date 2024/5/23 14:16
 **/
@Slf4j
public class UserFeignServiceFallback implements UserFeignService {
    @Override
    public Result findByName(String name) {
        return null;
    }
}
