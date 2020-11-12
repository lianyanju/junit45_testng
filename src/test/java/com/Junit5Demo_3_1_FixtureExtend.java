package com;



import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Junit5Demo_3_1_FixtureExtend  extends Junit5Demo_3_1_Fixture{



    @BeforeAll
    public static void before_child_All(){System.out.println("_child_beforeAll 执行\n");}

    @AfterAll
    public static void after_child_All(){System.out.println("\n_child_afterAll 执行\n");}


    @BeforeEach
    public  void before_child_Each(){System.out.println("\n_child_beforeEach 执行");}

    @AfterEach
    public  void after_child_Each(){System.out.println("_child_afterEach 执行");}

    @Test
    public  void child_fun1(){System.out.println("_child_fun1 执行");}


    @Test
    public  void child_fun2(){System.out.println("_child_fun2 执行");}

    @Test
    public  void child_fun3(){System.out.println("_child_fun3 执行");}




}
