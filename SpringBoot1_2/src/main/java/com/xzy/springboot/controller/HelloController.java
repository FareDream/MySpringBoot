package com.xzy.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 项目作者：XuZiyu
 * @project 项目名称：SpringBoot1_2
 * @package 包名：com.xzy.springboot.controller
 * @data 创建时间：2018-2-28 17:43
 * @description 描述：
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    @RequestMapping(value = "/")
    public String hello(ModelMap map){
        map.addAttribute("host","www.baidu.com");
        return "index";
    }

}
