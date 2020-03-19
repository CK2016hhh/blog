package com.blog.microservice.user.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-blog
 * @description: 测试rest接口
 * @author: 28906
 * @create: 2020-03-19 21:50
 **/
@RestController
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value="/hello")
    public void hello(){
        log.info( "hello from UserController");
    }



}
