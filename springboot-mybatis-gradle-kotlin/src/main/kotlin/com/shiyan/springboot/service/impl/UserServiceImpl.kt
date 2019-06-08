package com.shiyan.springboot.service.impl

import com.github.pagehelper.PageHelper
import com.github.pagehelper.PageInfo
import com.shiyan.springboot.dao.UserMapper
import com.shiyan.springboot.model.User
import com.shiyan.springboot.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 *
 * @author kevinfeng
 * @date 2019-06-06
 */
@Service
class UserServiceImpl : UserService {

    @Autowired lateinit var userMapper: UserMapper

    override fun findAll(): List<User> {
        return userMapper.findAll()
    }

    override fun findUserById(id: Long): User {
        return userMapper.selectByPrimaryKey(id)
    }

    override fun page(pageNo: Int, pageSize: Int): PageInfo<User> {
        // 设置分页参数
        PageHelper.startPage<User>(pageNo, pageSize)
        val list = userMapper.findAll()
        // 使用PageInfo对象包装分页返回结果
        return PageInfo(list)
    }

}