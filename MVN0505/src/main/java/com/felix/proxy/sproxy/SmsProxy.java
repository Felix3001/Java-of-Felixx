package com.felix.proxy.sproxy;

/**
 * @author Felix
 * @date 2021/5/9 8:58 下午
 * @DESC
 */
public class SmsProxy implements SmsService {

    /**
     *  1. 定义一个接口及其实现类
     *  2. 创建一个代理类同样实现这个接口
     *  3.将目标对象注入进代理类，然后在代理类的对应方法调用目标类中的对应方法。这样的话，
     * 我们就可以通过代理类屏蔽对目标对象的访问，并且可以在目标方法执行前后做一些自己想做的事情。
     */

    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }


    @Override
    public String send(String message) {

        System.out.println("before method send()...");
        smsService.send(message);
        System.out.println("after method send()....");
        return null;
    }


    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("java");
    }
}
