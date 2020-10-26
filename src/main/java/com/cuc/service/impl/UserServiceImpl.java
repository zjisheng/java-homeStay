package com.cuc.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cuc.dao.UserMapper;
import com.cuc.domain.User;
import com.cuc.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    UserMapper userMapper;

    @Override
    public Integer addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> findAll() {
        Wrapper wrapper = new EntityWrapper<User>();
        return userMapper.selectList(wrapper);
    }

    @Override
    public User findById(String userId) {
        return userMapper.selectById(userId);
    }

    @Override
    public Integer updateUser(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public Integer deleteUserId(String userId) {
        return userMapper.deleteById(userId);
    }

    /***
     * 删除批处理id
     * @param userId
     * @return
     */
    @Override
    public Integer deleteBatchIds(String[] userId){
        List<String> integers = Arrays.asList(userId);
        return userMapper.deleteBatchIds(integers);
    }

    @Override
    public Integer deleteUserMapId(String userId){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",userId);
        return userMapper.deleteByMap(map);//返回删除条数
    }
}
