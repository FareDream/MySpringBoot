package com.xzy.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 项目作者：XuZiyu
 * @project 项目名称：SpringBoot1_1
 * @package 包名：com.xzy.springboot.controller
 * @data 创建时间：2018-2-28 16:48
 * @description 描述：
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String index(ModelMap map){
        map.addAttribute("host","http://blog.didispace.com");
        return "index";
    }
}
