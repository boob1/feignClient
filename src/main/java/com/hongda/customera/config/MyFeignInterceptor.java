package com.hongda.customera.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @ClassName MyFeignInterceptor
 * @Description TODO
 * @Author liuyibo
 * @Date 2024/5/24 14:25
 **/
@Slf4j
@Component
public class MyFeignInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        log.info("===++++++++++++++++++++++request: {}", template.url());
        template.header("aaaa", "bbbb");
    }
}
