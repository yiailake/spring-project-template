package com.shiyan.springboot.controller


import com.github.pagehelper.PageInfo
import com.shiyan.springboot.model.User
import com.shiyan.springboot.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 *
 * @author kevinfeng
 * @date 2019-06-06
 */
@RestController
@RequestMapping("/user")
class UserController {
    @Autowired lateinit var userService: UserService

    @GetMapping("/findAll")
    fun findAll(): List<User> {
        return userService.findAll()
    }

    @GetMapping("/{id}")
    fun findUserById(@PathVariable(value = "id") id: Long): User {
        return userService.findUserById(id)
    }

    @GetMapping("/page")
    fun page(@RequestParam(value = "pageNo", defaultValue = "0") pageNo: Int,
             @RequestParam(value = "pageSize", defaultValue = "10") pageSize: Int): PageInfo<User> {
        return userService.page(pageNo, pageSize)
    }
}