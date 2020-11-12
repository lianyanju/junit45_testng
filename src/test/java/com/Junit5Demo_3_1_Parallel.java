package com;



import org.junit.jupiter.api.*;



public class Junit5Demo_3_1_Parallel extends Junit5Demo_3_1_Fixture
{
    //Junit5Demo_3_1_Fixture父类的  BeforeAll和AfterAll、beforeEach、 afterEach
    // 会被继承给子类，如果子类没有 重写父类 的方法的的情况下

    @RepeatedTest(10) //表示该线程重复顺序进行10遍
    public void fun1 () throws InterruptedException {
        int count = calc.count(1);
        System.out.println("res = " + count);


//        assertAll("fisrt test assertall",
//                ()->assertEquals(3,addres,"addres"),
//                ()->assertEquals(3,jianres,"jianres"),
//                ()->assertEquals(3,chengres,"chengres"),
//                ()->assertEquals(3,chures,"chures"),
//                ()->assertEquals(3,count,"count")
//        );

    }


}
