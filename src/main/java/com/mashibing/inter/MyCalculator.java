package com.mashibing.inter;

import com.mashibing.util.LogUtil;

import java.lang.reflect.Method;

public class MyCalculator implements Calculator {
    public int add(int i, int j) throws NoSuchMethodException {
        Method method = getClass().getMethod("add", int.class, int.class);
        LogUtil.start(method, i, j);
        int result = i + j;
        LogUtil.stop(method, result);
        return result;
    }

    public int sub(int i, int j) throws NoSuchMethodException {
        Method method = getClass().getMethod("sub", int.class, int.class);
        LogUtil.start(method, i, j);
        int result = i - j;
        LogUtil.stop(method, result);
        return result;
    }

    public int mul(int i, int j) throws NoSuchMethodException {
        Method method = getClass().getMethod("mul", int.class, int.class);
        LogUtil.start(method, i, j);
        int result = i * j;
        LogUtil.stop(method, result);
        return result;
    }

    public int div(int i, int j) throws NoSuchMethodException, ArithmeticException {
        Method method = getClass().getMethod("div", int.class, int.class);
        LogUtil.start(method, i, j);
        int result = i / j;
        LogUtil.stop(method, result);
        return result;
    }
}
