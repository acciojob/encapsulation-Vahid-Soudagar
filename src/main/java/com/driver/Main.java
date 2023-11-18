package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        /*
        D:\Accio\Spring1 Task\encapsulation-Vahid-Soudagar\src\main\java\com\driver\Main.java:6:12
        java: name has private access in com.driver.RWOnly
         */
        obj.setName("Vahid");
        System.out.println(obj.getName());
    }
}