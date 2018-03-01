package com.xzy.springboot.controller;

import com.xzy.springboot.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuZiyu
 * @date 2018-3-113:44
 * @description
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
//        return "Hello World!";
    }

    @RequestMapping(value = "/json")
    public String myException() throws MyException {
        throw new MyException("显示的是我的错误");
    }


}
