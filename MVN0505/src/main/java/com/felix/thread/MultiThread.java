package com.felix.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author Felix
 * @date 2021/5/15 8:44 上午
 * @DESC
 */
public class MultiThread {


    public static void main(String[] args) {

        // 获取Java线程管理
        ThreadMXBean threadMxbean = ManagementFactory.getThreadMXBean();

        // 需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMxbean.dumpAllThreads(false,false);

        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "]" + threadInfo.getThreadName());
        }
    }






}
