package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println(
                "LOG: Before executing method - "
                        + joinPoint.getSignature().getName()
        );
    }

    @After("execution(* com.library.service.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {

        System.out.println(
                "LOG: After executing method - "
                        + joinPoint.getSignature().getName()
        );
    }
}