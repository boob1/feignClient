package com.hongda.customera.service;


import com.hongda.customera.domain.base.Result;

public interface UserService {
    Result findByName(String name);
}
