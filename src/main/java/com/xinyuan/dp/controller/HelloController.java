package com.xinyuan.dp.controller;

import com.xinyuan.dp.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private IHelloService iHelloService;

    @RequestMapping("/query")
    public Map<String,Object> map(){
        return this.iHelloService.queryForList().get(0);
    }
}
