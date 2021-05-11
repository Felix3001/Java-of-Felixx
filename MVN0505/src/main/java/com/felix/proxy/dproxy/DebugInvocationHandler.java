package com.felix.proxy.dproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Felix
 * @date 2021/5/10 7:02 下午
 * @DESC
 */
public class DebugInvocationHandler implements InvocationHandler {

    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before method" + method.getName());
        Object result = method.invoke(target,args);
        System.out.println("after method" + method.getName());
        return  result;

    }
}
