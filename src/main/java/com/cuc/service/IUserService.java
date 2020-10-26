package com.cuc.service;

import com.cuc.domain.User;

import java.util.List;

public interface IUserService {
    Integer addUser(User user);

    List<User> findAll();

    Integer deleteUserId(String userId);

    Integer deleteUserMapId(String userId);

    Integer deleteBatchIds(String[] userId);

    User findById(String userId);

    Integer updateUser(User user);
}
