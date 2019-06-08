package com.shiyan.springboot.service;

import com.shiyan.springboot.model.User
import com.github.pagehelper.PageInfo

/**
 *
 * @author kevinfeng
 * @date 2019-06-06
 */
interface UserService {
    // 查询所有用户
    fun findAll(): List<User>

    // 通过ID查询用户
    fun findUserById(id: Long): User

    // 分页查询用户
    fun page(pageNo: Int, pageSize: Int): PageInfo<User>
}