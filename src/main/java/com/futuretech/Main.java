package com.futuretech;

public class Main {
    public static void main(String[] args) {
        var props = System.getProperties();
        props.forEach((key, value) -> {
            if ("someproperty".equals(key)) {
                System.out.println(key + "=" + value);
            }
        });
        System.out.println("Hello world!");
        System.out.println("Hello again!");
    }
}