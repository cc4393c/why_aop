package com.mashibing.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Component
@Aspect
public class LogUtil {

    @Before("execution(public int com.mashibing.inter.MyCalculator.*(int, int))")
    public static void start(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println(name + " 方法开始执行，参数为：" + Arrays.asList(args));
    }

    @AfterReturning(value = "execution(public int com.mashibing.inter.MyCalculator.*(int, int))", returning = "result")
    public static void stop(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + " 方法结束执行，结果为：" + result);
    }

    @AfterThrowing(value = "execution(public int com.mashibing.inter.MyCalculator.*(int, int))", throwing = "e")
    public static void logException(JoinPoint joinPoint, Exception e) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + " 方法出现异常：" + e.getMessage());
    }

    @After("execution(public int com.mashibing.inter.MyCalculator.*(int, int))")
    public static void end(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + " 方法执行结束了......");
    }
}
