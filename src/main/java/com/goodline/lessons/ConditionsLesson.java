package com.goodline.lessons;

import java.util.Scanner;

public class ConditionsLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.next();

        if(name == "ученик") {
            System.out.println("Привет, ученик");
        }

//        if(name == "ученик") {
//            System.out.println("Привет, ученик");
//        } else {
//            System.out.println("Я тебя не знаю");
//        }

//        if(name == "ученик") {
//            System.out.println("Привет, ученик");
//        } else if(name == "бла") {
//            System.out.println("Что за бла?");
//        } else {
//            System.out.println("Я тебя не знаю");
//        }
    }
}
