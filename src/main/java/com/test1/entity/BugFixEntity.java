package com.test1.entity;

public class BugFixEntity {
    public static void main(String[] args) {
        BugFixEntity bf = new BugFixEntity();
        bf.test(100, 20.3, true,500);
    }
    private void test(int x,double d, boolean bool, int y ) {
        System.out.println(x);
        System.out.println(d);
        System.out.println(bool);
         System.out.println(y);

    }
}
