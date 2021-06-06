package com.felix;

/**
 * @author Felix
 * @date 2021/5/31 9:00 下午
 * @DESC
 */
public class StaticGists {

    static {
        System.out.println("运行静态代码块。。。。");
    }

    {
        System.out.println("运行非静态代码块。。。。");
    }


    public StaticGists() {

        System.out.println("运行构造函数。。。。");

    }

    public static void main(String[] args) {

        StaticGists staticGists = new StaticGists();
        System.out.println("---------------------------------------");
        StaticGists staticGists1 = new StaticGists();

    }
}
