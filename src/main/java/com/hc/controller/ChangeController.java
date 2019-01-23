package com.hc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChangeController {
	@RequestMapping("/Hi")

    public String sayHello() {

        return "hellow";//在没有配置的情况下，return "hello”; 或者return "hello"都可以，它们都会到templates/index.html去。

    }  
	
	@RequestMapping("/in")

    public String sayIn() {

        return "index";//在没有配置的情况下，return "hello”; 或者return "hello"都可以，它们都会到templates/index.html去。

    }  

}
