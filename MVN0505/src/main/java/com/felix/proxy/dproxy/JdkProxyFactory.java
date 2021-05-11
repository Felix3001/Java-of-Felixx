package com.felix.proxy.dproxy;

import com.felix.refelction.TargetObject;

import java.lang.reflect.Proxy;

/**
 * @author Felix
 * @date 2021/5/10 7:06 下午
 * @DESC
 */
public class JdkProxyFactory {

    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target));
    }

    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsSeviceImpl());
        smsService.send("java....");
    }
}