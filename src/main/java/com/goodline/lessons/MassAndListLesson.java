package com.goodline.lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MassAndListLesson {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] names = new String[10];

        System.out.println(names.length);

        names[0] = scanner.next();
        names[1] = scanner.next();
        names[2] = scanner.next();
        names[3] = scanner.next();
        names[4] = scanner.next();
        names[5] = scanner.next();
        names[6] = scanner.next();
        names[7] = scanner.next();
        names[8] = scanner.next();
        names[9] = scanner.next();

        List<String> u = new ArrayList<>();
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);
        System.out.println(names[6]);
        System.out.println(names[7]);
        System.out.println(names[8]);
        System.out.println(names[9]);
        int length = 10;
        String[] massiv = new String[length]; // будет инициализирован новый массив с именем massiv, который содержит length элементов типа String
    }

    public static class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World");
        }
    }
}
