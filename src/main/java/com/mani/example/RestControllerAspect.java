package com.mani.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RestControllerAspect {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    @Before("execution(public * com.mani.example.api.rest.*Controller.*(..))")
    public void logBeforeRestCall(JoinPoint pjp) throws Throwable {
        log.info(":::::AOP Before REST call:::::" + pjp);
    }

    /*@After("execution(public * com.mani.example.api.rest.*Controller.*(..))")
    public void logAfterRestCall(JoinPoint pjp) throws Throwable {
        log.info(":::::AOP After REST call:::::" + pjp);
    }

    @AfterReturning(pointcut = "execution(public * com.mani.example.api.rest.*Controller.*(..))", returning = "result")
    public void logAfterReturn(JoinPoint pjp, Object result) throws Throwable {
        log.info(":::::AOP After returning REST call:::::" + pjp);
        log.info(":::::AOP After returning REST call:::::" + result);
    }

    @AfterThrowing (pointcut = "execution(public * com.mani.example.api.rest.*Controller.*(..))",throwing= "error")
    public void logAfterThrowing(JoinPoint pjp, Throwable error) throws Throwable {
        log.info(":::::AOP After Exception :::::" + pjp);
        log.info(":::::AOP After Exception :::::" + error);
    }

    @Around("execution(public * com.mani.example.api.rest.*Controller.*(..))")
    public void logAround(JoinPoint pjp) throws Throwable {
        log.info(":::::AOP Around REST call:::::" + pjp);
    }*/
}
