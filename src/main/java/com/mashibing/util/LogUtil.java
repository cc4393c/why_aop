package com.mashibing.util;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogUtil {

    public static void start(Method method, Object... objects) {
        String methodName = method.getName();
        System.out.println(methodName + " 方法开始执行，参数为：" + Arrays.asList(objects));
    }

    public static void stop(Method method, Object... objects) {
        String methodName = method.getName();
        System.out.println(methodName + " 方法结束执行，结果为：" + Arrays.asList(objects));
    }
}
