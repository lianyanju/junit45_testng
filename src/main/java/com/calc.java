package com;

public class calc {

   public static int res = 0;

    public static int add(int x, int y) {
//        res = x + y; 这种写法是 引用全局变量
        int res = x + y;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static int jian(int x, int y) {
        int res = x -  y;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static int cheng(int x, int y) {
        res = x + y;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static int chu(int x, int y) {
        res = x + y;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static int count(int x) throws InterruptedException {
        int i = res;
        Thread.sleep(1000);
        res = i + x;
        return  res;
    }

    public static synchronized int syncount(int x) throws InterruptedException {
        int i = res;
        Thread.sleep(1000);
        res = i + x;
        return  res;
    }

    public static int clear(){
        System.out.println("当前状态已经清零");
        return res = 0;
    }
}

