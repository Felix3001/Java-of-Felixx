package com.felix.proxy.sproxy;

/**
 * @author Felix
 * @date 2021/5/9 8:57 下午
 * @DESC
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("send message: " + message);
        return message;
    }
}
