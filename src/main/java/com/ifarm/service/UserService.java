package com.ifarm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ifarm.entity.User;

/**
 * 用户Service接口
 * 
 * @author ifarm
 * @since 2024-01-01
 */
public interface UserService extends IService<User> {

    /**
     * 根据用户名查询用户
     * 
     * @param username 用户名
     * @return 用户信息
     */
    User getByUsername(String username);

    /**
     * 检查用户名是否存在
     * 
     * @param username 用户名
     * @return 是否存在
     */
    boolean existsByUsername(String username);
} 