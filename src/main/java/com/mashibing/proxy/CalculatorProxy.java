package com.mashibing.proxy;

import com.mashibing.inter.Calculator;
import com.mashibing.util.LogUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 帮助 Calculator 生成代理对象的类
 */
public class CalculatorProxy {

    /**
     * 为传入的参数对象创建一个动态代理对象
     * @param calculator 被代理对象
     * @return
     */
    public static Calculator getProxy(final Calculator calculator) {
        // 被代理对象的类加载器
        ClassLoader loader = calculator.getClass().getClassLoader();
        // 被代理对象的接口
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        // 方法执行器，执行被代理对象的目标方法
        InvocationHandler handler = new InvocationHandler() {
            /**
             * 执行目标方法
             * @param proxy 代理对象，给jdk使用，任何时候都不要操作此对象
             * @param method 当前将要执行的目标对象的方法
             * @param args 这个方法调用时外界传入的参数值
             * @return
             * @throws Throwable
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 利用反射执行目标方法后的返回值
                Object result = null;
                try {
                    LogUtil.start(method, args);
                    result = method.invoke(calculator, args);
                    LogUtil.stop(method, result);
                } catch (Exception e) {
                    LogUtil.logException(method, e);
                } finally {
                    LogUtil.end(method);
                }
                return result;
            }
        };
        Object proxyInstance = Proxy.newProxyInstance(loader, interfaces, handler);
        return (Calculator) proxyInstance;
    }
}
