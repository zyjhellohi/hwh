package com.hwh.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class indexController {


    @RequestMapping("/log")
    public String index(){
        log.info("测试日志git" );
        return "hello word";
    }
}
