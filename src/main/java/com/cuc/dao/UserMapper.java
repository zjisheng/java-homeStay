package com.cuc.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cuc.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
