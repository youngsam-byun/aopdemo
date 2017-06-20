package com.example.web.controller;

import com.example.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YS on 2017-06-20.
 */

@RestController
public class TestController {

    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping(value = {"/",""})
    public String test(){
        return testService.test();
    }

}
