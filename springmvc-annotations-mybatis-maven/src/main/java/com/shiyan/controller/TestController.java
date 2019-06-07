package com.shiyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kevinfeng
 * @date 2019-06-07
 */
@Controller
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String prepareView(Model model) {
        model.addAttribute("msg", "SpringMVC Annotations Start!!!");
        return "my-page";
    }
}
