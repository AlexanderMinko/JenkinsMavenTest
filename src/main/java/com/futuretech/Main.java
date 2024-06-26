package com.futuretech;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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
        var path = Paths.get("What"); //var/jenkins_home
        Files.deleteIfExists(path);
        Files.writeString(path, args[0]);
    }
}