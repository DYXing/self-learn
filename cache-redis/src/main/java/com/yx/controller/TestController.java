package com.yx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:TODO
 *
 * @author dulj
 * @date 2022/7/1 23:56
 * @since V1.0
 * Copyright www.enbrands.com
 */
@RestController
public class TestController {
    @GetMapping("/get")
    public String get(){
        return "hello world";
    }

}
