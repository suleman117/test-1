package com.test1.entity;

public class BugFixEntity {
    public static void main(String[] args) {
        BugFixEntity bf = new BugFixEntity();
        bf.test(100, 10.8, 200,500);
    }
    private void test(int ...x) {
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
         System.out.println(x[3]);

    }
}
