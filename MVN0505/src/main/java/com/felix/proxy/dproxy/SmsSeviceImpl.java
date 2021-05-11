package com.felix.proxy.dproxy;

/**
 * @author Felix
 * @date 2021/5/10 7:01 下午
 * @DESC
 */
public class SmsSeviceImpl implements SmsService{
    @Override
    public String send(String message) {
        System.out.println("send message: " + message);
        return message;
    }
}
