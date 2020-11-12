package com;


import org.junit.jupiter.api.RepeatedTest;

public class Junit5Demo_4_2_MixParallel
{
    @RepeatedTest(6)
    //这个无法模拟多线程，就是说一个单线程的顺序操作无法模拟多线程的操作
    public void testAdd()
    {
        int res =  calc.add(1,4);
        System.out.println("add res = " + res);

    }

    @RepeatedTest(6)
    //这个无法模拟多线程，就是说一个单线程的顺序操作无法模拟多线程的操作
    public void testJian()
    {
        int res = calc.jian(4,1);
        System.out.println(" jia()  res = " + res);

    }


}
