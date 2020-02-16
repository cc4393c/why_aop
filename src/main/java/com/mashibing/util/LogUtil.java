package com.mashibing.util;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogUtil {

    public static void start(Method method, Object... objects) {
        System.out.println(method.getName() + " 方法开始执行，参数为：" + Arrays.asList(objects));
    }

    public static void stop(Method method, Object... objects) {
        System.out.println(method.getName() + " 方法结束执行，结果为：" + Arrays.asList(objects));
    }

    public static void logException(Method method, Exception e) {
        System.out.println(method.getName() + " 方法出现异常：" + e.getCause());
    }

    public static void end(Method method) {
        System.out.println(method.getName() + " 方法执行结束了......");
    }
}
