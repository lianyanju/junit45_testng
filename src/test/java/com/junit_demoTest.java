package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class junit_demoTest {
    @Test
    public void fun1() throws InterruptedException {
        assertEquals(3,3,"实际与期望结果不符");
        int addres = calc.add(1,3);
        int chengres = calc.cheng(1,3);
        int jianres = calc.jian(1,3);
        int chures = calc.chu(1,3);
        int count = calc.count(1);


        assertAll("fisrt test assertall",
                ()->assertEquals(3,addres,"addres"),
                ()->assertEquals(3,jianres,"jianres"),
                ()->assertEquals(3,chengres,"chengres"),
                ()->assertEquals(3,chures,"chures"),
                ()->assertEquals(3,count,"count")
        );

    }
}

