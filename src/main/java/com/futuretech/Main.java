package com.futuretech;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(args));
        var props = System.getProperties();
        props.forEach((key, value) -> {
            if ("someproperty".equals(key)) {
                System.out.println(key + "=" + value);
            }
        });
        System.out.println("Hello world!");
        System.out.println("Hello again!");
        var path = Paths.get("/var/jenkins_home/what"); //var/jenkins_home
//        Files.createFile(path);
        Files.writeString(path, "test");
    }
}