package com.example.app.service.impl;

import com.example.app.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by YS on 2017-06-20.
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {

        System.out.println("TestServiceImpl.test called");
        return "TestServiceImpl.test called";
    }
}
