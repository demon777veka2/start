package com.goodline.lessons;

import java.util.Scanner;

public class FunctionsLesson {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = "";

        System.out.print("Введи что-нибудь: ");
        input = scanner.next();
        System.out.println("Ты ввел: " + input);

        System.out.print("Введи что-нибудь: ");
        input = scanner.next();
        System.out.println("Ты ввел: " + input);


        System.out.print("Введи что-нибудь: ");
        input = scanner.next();
        System.out.println("Ты ввел: " + input);
    }
}
