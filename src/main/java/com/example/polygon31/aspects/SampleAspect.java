package com.example.polygon31.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class SampleAspect {

    @Around("execution(* com.example.polygon31.services.SampleService.getDate(..))")
    public Object log(ProceedingJoinPoint joinPoint) {
        log.info("Calling method {}", joinPoint.getSignature().getName());
        try {
            return joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @Before("execution(* com.example.polygon31.services.SampleService.getDate(..))")
    public void checkAspect(JoinPoint joinPoint){
        log.info("check aspect");
    }
}
