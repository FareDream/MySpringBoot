package com.xzy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 项目作者：XuZiyu
 * @project 项目名称：SpringCloud2_2
 * @package 包名：com.xzy.springcloud.controller
 * @data 创建时间：2018-2-26 13:53
 * @description 描述：使用配置文件进行随机数的生成
 * PS：此处不可以使用bean的方式注入只可以使用@Value进行注入
 *     固定的随机数名，最后一位可以自定义前三位必须是com.didispace.blog.*
 */
@RestController
@PropertySource("classpath:random.properties")
public class RandomController {
    @Value("${com.didispace.blog.value}") //生成随机字符串
    private String value;
    @Value("${com.didispace.blog.number}") // 生成int随机数
    private int number;
    @Value("${com.didispace.blog.bignumber}")  //生成long随机数
    private long bignumber;
    @Value("${com.didispace.blog.test1}") //${random.int(10)}生成十以内的随机数
    private int test1;
    @Value("${com.didispace.blog.test2}") //${random.int[10,20]}生成10-20的随机数
    private int test2;

    @RequestMapping("/random")
    public String randomNumber(){
        return String.valueOf(number)+"--"+value+"--"+String.valueOf(bignumber)+"--"+String.valueOf(test1)+"--"+String.valueOf(test2);
    }

}
