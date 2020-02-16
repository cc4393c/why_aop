package com.mashibing.util;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Component
@Aspect
public class LogUtil {

    @Before("execution(public int com.mashibing.inter.MyCalculator.*(int, int))")
    public static void start() {
        System.out.println(" 方法开始执行，参数为：");
    }

    @AfterReturning("execution(public int com.mashibing.inter.MyCalculator.*(int, int))")
    public static void stop() {
        System.out.println(" 方法结束执行，结果为：");
    }

    @AfterThrowing("execution(public int com.mashibing.inter.MyCalculator.*(int, int))")
    public static void logException() {
        System.out.println(" 方法出现异常：");
    }

    @After("execution(public int com.mashibing.inter.MyCalculator.*(int, int))")
    public static void end() {
        System.out.println(" 方法执行结束了......");
    }
}
