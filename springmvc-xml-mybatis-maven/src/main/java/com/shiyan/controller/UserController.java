package com.shiyan.controller;

import com.shiyan.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
}
