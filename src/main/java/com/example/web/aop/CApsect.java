package com.example.web.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by YS on 2017-06-20.
 */


@Component
@Aspect
public class CApsect {

    @Around("within(com.example.web.controller.*)")
    public Object testAspect(ProceedingJoinPoint proceedingJoinPointt) throws Throwable {

        long startTime=System.currentTimeMillis();

        Object o=proceedingJoinPointt.proceed();

        long endTime=System.currentTimeMillis();

        System.out.println(endTime-startTime);
        System.out.println("around advice executed");
        return o;

    }

}
