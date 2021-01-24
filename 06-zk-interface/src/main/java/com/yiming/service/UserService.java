package com.yiming.service;

import com.yiming.entity.User;

public interface UserService {

    /**
     * 根据用户标识获取用户的信息
     * @param id
     * @return 用户对象
     */
    User queryUserById(Integer id ,String username);
}
