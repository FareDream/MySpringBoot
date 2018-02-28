package com.xzy.springboot.entity;

/**
 * @author 项目作者：XuZiyu
 * @project 项目名称：SpringBoot1
 * @package 包名：com.xzy.springboot.entity
 * @data 创建时间：2018-2-28 16:09
 * @description 描述：
 */
public class User {
    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
