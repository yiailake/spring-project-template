package com.easy.springboot.demo_springboot_with_mybatis.dao

import com.easy.springboot.demo_springboot_with_mybatis.model.User
import org.apache.ibatis.annotations.Select

/**
 *
 * @author kevinfeng
 * @date 2019-06-06
 */
interface UserMapper {
    fun selectByPrimaryKey(id: Long): User

    @Select("SELECT * FROM user")
    fun findAll(): List<User>
}