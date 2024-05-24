package com.hongda.customera.domain.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName UserVO
 * @Description TODO
 * @Author liuyibo
 * @Date 2024/5/23 11:42
 **/
@Data
public class UserVO implements Serializable {
    private String name;
    private Integer age;
}
