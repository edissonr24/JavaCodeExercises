package org.example.JavaChallenges2024.p02_functional_prog.p03_fp_course;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FP05Files {
    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("file.txt"))
            .map(str -> str.split(" "))
            .flatMap(Arrays::stream)
            .distinct()
            .sorted()
            .forEach(System.out::println);
        System.out.println("----------------------------");

        Files.lines(Paths.get("file.txt"))
                .map(String::toUpperCase)
                .filter(str -> str.startsWith("E"))
                .forEach(System.out::println);
        System.out.println("----------------------------");

        Files.list(Paths.get("."))
                //.filter(Files::isDirectory)
                .forEach(System.out::println);
        System.out.println("----------------------------");

        Path path = Paths.get(".");
        try (Stream<Path> paths = Files.list(path)) {
            paths.forEach(System.out::println);
        } catch (IOException e) {
        }
        System.out.println("----------------------------");


    }
}
