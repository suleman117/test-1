package com.test1.entity;

public class BugFixEntity {
    public static void main(String[] args) {
        BugFixEntity bf = new BugFixEntity();
        bf.test(100, 10.8, 200);
    }
    private void test(int i, double d, int y) {
        System.out.println(i);
        System.out.println(d);
        System.out.println(y);
    }
}
