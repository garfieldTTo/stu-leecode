package com.lc.test.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author fj
 * @description
 * @date 2019/2/23
 * @time 下午9:46
 **/
public class JdkProxy implements InvocationHandler {

    private Object proxy;

    public Object getProxy(Object target) {

        this.proxy = target;
        Object result = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);

        return result;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
