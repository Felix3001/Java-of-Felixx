package com.felix.thread;

/**
 * @author Felix
 * @date 2021/5/15 8:51 上午
 * @DESC
 */
public class DeadLockDemo {

    private static final Object RESOURCE1 = new Object();
    private static final Object RESOURCE2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (RESOURCE1) {
                System.out.println(Thread.currentThread() + "get resource1...");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "Waiting get resource2...");
                synchronized (RESOURCE2) {
                    System.out.println(Thread.currentThread() + "get resource2...");
                }
            }
        },"线程1").start();


        new Thread(() -> {
            synchronized (RESOURCE1) {
                System.out.println(Thread.currentThread() + "get resource1...");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "Waiting get resource2...");
                synchronized (RESOURCE2) {
                    System.out.println(Thread.currentThread() + "get resource2...");
                }
            }
        },"线程2").start();



    }
}
