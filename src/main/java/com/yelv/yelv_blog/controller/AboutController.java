package com.yelv.yelv_blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 关于我
 */
@Controller
public class AboutController {

    @GetMapping("/about")
    public String about(){
        return "/home/about";
    }
}
