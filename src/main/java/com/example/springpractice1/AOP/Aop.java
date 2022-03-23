package com.example.springpractice1.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop {
    @Pointcut("execution( * com.example.springpractice1.*.*(..))")
    public void cut() {}
    @Before("cut()")
    public void before() {
        System.out.println("before");
    }
    @AfterReturning(value = "cut()", returning = "e")
    public void afterReturning(Object e) {
        System.out.println(e);
    }
    @Around(value = "cut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object o = pjp.proceed();
        System.out.println("Around");
        return o;
    }
}
