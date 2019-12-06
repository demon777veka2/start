package com.goodline.lessons;

import java.util.Scanner;

public class InputOutputLesson {
    public static void main(String[] args) {
        System.out.println("Тут текст"); // Выведет в консоль "Тут текст"

        String text = "Другой текст"; // Тут мы создали переменную со значением "Другой текст"
        System.out.println(text); // А тут выведем эту переменную

        System.out.println(1234567); // Печатать можно не только текст, но и числа

        int variable = 123123123;
        System.out.println(variable);

        Scanner scanner = new Scanner(System.in); // Этот сканнер позволяет читать то, что ввели вы

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt(); // На этом моменте консоль будет ждать пока вы что-нибудь введете
        System.out.println(userNumber); // Напечатает то, что вы введете

        System.out.print("Введите текст: ");
        String userText = scanner.next(); // А тут можно будет ввести не только число, но и текст
        System.out.println(userText);
    }
}
