package com.shiyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kevinfeng
 * @date 2019-06-08
 */
@Controller
@RequestMapping("/test")
public class ShiyanTestController {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return "hello";
    }
}
