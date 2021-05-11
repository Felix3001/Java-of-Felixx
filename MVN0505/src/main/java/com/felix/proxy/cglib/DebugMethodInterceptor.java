package com.felix.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Felix
 * @date 2021/5/11 6:56 下午
 * @DESC
 */
public class DebugMethodInterceptor implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before method" + method.getName());
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("after method " + method.getName());
        return object;
    }
}
