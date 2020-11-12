package com;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit5Demo_5_1_Allure
{
    @RepeatedTest(6)
    //这个无法模拟多线程，就是说一个单线程的顺序操作无法模拟多线程的操作
    public void testAdd()
    {
        int res =  calc.add(1,4);
        System.out.println("add res = " + res);
        assertEquals(6,res,"testAdd()");

    }

    @Test
    public void testAdd1()
    {

        int res =  calc.add(1,4);
        assertEquals(6,res,"testAdd()");

    }

    @Test
    public void testJian2()
    {

        int res =  calc.jian(9,4);
        assertEquals(6,res,"testJian()");

    }

    @RepeatedTest(6)
    //这个无法模拟多线程，就是说一个单线程的顺序操作无法模拟多线程的操作
    public void testJian()
    {
        int res = calc.jian(4,1);
        System.out.println(" jia()  res = " + res);
        assertEquals(6,res,"testAdd()");

    }


}
