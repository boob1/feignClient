package com.hongda.customera.feign;

import com.hongda.customera.domain.base.Result;
import com.hongda.customera.fallback.UserFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Component
@FeignClient(name = "productA",path = "/productA",contextId = "userFeignService", fallback = UserFeignServiceFallback.class)
public interface UserFeignService {
    @RequestMapping(value = "/user/findListByName/{name}", method = RequestMethod.GET)
    Result findByName(@PathVariable("name") String name);
}
