package com;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class demo {



    @Test
    @Order(1)
    public void testAdd()
    {

        int res =  calc.add(1,4);
        assertEquals(6,res,"testAdd()");

    }

    @Test
    @Order(2)
    public void testJian()
    {

        int res =  calc.jian(9,4);
        assertEquals(6,res,"testJian()");

    }

    @Test
    @Order(3)
    public void testCheng()
    {

        int res =  calc.cheng(1,4);
//        如果这里第一个断言失败的话 第二个断言不会再执行所以可以使用assertAll
        assertEquals(4,res,"testCheng()");
//        assertEquals(9,res,"testCheng()22");

    }

    @Test
    @Order(4)
    public void testChu() {

        int res = calc.chu(1, 4);
        assertEquals(6, res, "testChu()");
    }

    @Test
//    @Order(5)
    @BeforeEach
    public void testclear()
    {
        int res  = calc.clear();
        assertEquals(0,res,"testclear()");
    }


    @Test
    @Order(6)
    public void testCount() throws InterruptedException {

        calc.count(1);
        int res = calc.count(1);
        Thread.sleep(1000);
        assertEquals(2, res, "testCount()");

    }

}
