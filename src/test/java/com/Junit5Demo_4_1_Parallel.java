package com;


import org.junit.jupiter.api.RepeatedTest;


public class Junit5Demo_4_1_Parallel
{
    @RepeatedTest(10)
    //这个无法模拟多线程，就是说一个单线程的顺序操作无法模拟多线程的操作
    public void testCount() throws InterruptedException
    {
        int count = calc.count(1);
        Thread.sleep(400);
        System.out.println("res = " + count);

    }

    @RepeatedTest(6)
    //这个无法模拟多线程，就是说一个单线程的顺序操作无法模拟多线程的操作
    public void testSynCount() throws InterruptedException
    {
        int count = calc.syncount(1);
        Thread.sleep(400);
        System.out.println("res = " + count);

    }


}
