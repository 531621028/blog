package com.hk.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kang on 2017/11/17.
 */
@Controller
public class PersonController {

    @RequestMapping("/about")
    public String about(Model model){
        return "about";
    }
}
