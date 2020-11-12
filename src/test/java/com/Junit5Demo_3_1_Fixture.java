package com;


import org.junit.jupiter.api.*;


public class Junit5Demo_3_1_Fixture
{

//
    @BeforeAll
    public static void beforeAll(){
        //只有 BeforeAll和AfterAll为静态方法
        System.out.println("beforeAll 执行\n");}

    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll 执行\n");}


    @BeforeEach
    public  void beforeEach(){System.out.println("beforeEach 执行");}

    @AfterEach
    public  void afterEach(){System.out.println("afterEach 执行\n");}

    //总结：这四个 BeforeAll和AfterAll、beforeEach、 afterEach  会被继承给子类，如果子类并没有 重写父类的方法的化

    @Test
    public  void fun1() throws InterruptedException {
        System.out.println("fun1 执行");
    }


    @Test
    public  void fun2(){
        System.out.println("fun2 执行");
    }

    @Test
    public  void fun3(){
        System.out.println("fun3 执行");
    }




}
