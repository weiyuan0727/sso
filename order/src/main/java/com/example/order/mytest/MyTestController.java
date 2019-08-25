package com.example.order.mytest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

/**
 * Created by weiyuan on 2019/8/24/024.
 */
@Controller
@Slf4j
public class MyTestController {

    @RequestMapping("/hello")
    public String hello(){
        log.info("======hello========");
        return "hello";
    }
    @RequestMapping("/index2")
    public  String index() {
        log.info("=========index===========");
        return "index";
    }
}
