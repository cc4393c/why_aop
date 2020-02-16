package com.mashibing.inter;

public class MyCalculator implements Calculator {
    public int add(int i, int j) {
        System.out.println("add 方法开始执行，参数为：" + i + ", " + j);
        int result = i + j;
        System.out.println("add 方法结束执行，结果为：" + result);
        return result;
    }

    public int sub(int i, int j) {
        System.out.println("sub 方法开始执行，参数为：" + i + ", " + j);
        int result = i - j;
        System.out.println("sub 方法结束执行，结果为：" + result);
        return result;
    }

    public int mul(int i, int j) {
        System.out.println("mul 方法开始执行，参数为：" + i + ", " + j);
        int result = i * j;
        System.out.println("mul 方法结束执行，结果为：" + result);
        return result;
    }

    public int div(int i, int j) {
        System.out.println("div 方法开始执行，参数为：" + i + ", " + j);
        int result = i / j;
        System.out.println("div 方法结束执行，结果为：" + result);
        return result;
    }
}
