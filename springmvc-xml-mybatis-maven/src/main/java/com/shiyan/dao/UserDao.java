package com.shiyan.dao;

import com.shiyan.model.User;

import java.util.List;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
public interface UserDao {
    // 查询用户
    User findById(int id);
    List<User> findAll();
}
