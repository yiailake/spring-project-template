package com.shiyan.springboot.dao

import com.shiyan.springboot.model.User
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