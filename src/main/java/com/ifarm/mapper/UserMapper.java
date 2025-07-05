package com.ifarm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ifarm.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Mapper接口
 * 
 * @author ifarm
 * @since 2024-01-01
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

} 