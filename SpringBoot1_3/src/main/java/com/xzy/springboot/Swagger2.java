package com.xzy.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 项目作者：XuZiyu
 * @project 项目名称：SpringBoot1_3
 * @package 包名：com.xzy.springboot
 * @data 创建时间：2018-2-28 18:00
 * @description 描述：通过使用@Configuration注解来让spring加载本类
 *                      再通过@EnableSwagger2来启动swagger2
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    /**
     * 构建swagger2
     * 并使swagger2关联服务包
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xzy.springboot.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 自定义swagger2的基本内容
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("更多Spring Boot相关文章请关注：http://blog.didispace.com/")
                .termsOfServiceUrl("http://blog.didispace.com/")
                .contact("程序猿DD")
                .version("1.0")
                .build();
    }

}
