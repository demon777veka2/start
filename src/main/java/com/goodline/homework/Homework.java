package com.goodline.homework;

import com.goodline.helpers.Variables;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Homework {
    // В этом массиве неизвестно сколько элементов
    // Количество элементов всегда разное
    static String[] names = Variables.names;

    // Массив с числами
    static int[] numbers = Variables.numbers;

    public static void main(String[] args) {
        // Здесь запускаете функции
        System.out.println(Calculator.div(26,06)) ;
    }

    public static int[] printEven() {
        // Вернуть массив четных чисел меньше 100
        int k=0;
        for (int i=0;i!=numbers.length;i++)
        {
            if ((numbers[i] % 2!=1) && (numbers[i]<100) ) {
                k++;
            }
        }
        int[] myArray = new int[k];
        k=-1;
        for (int i=0;i!=numbers.length;i++)
        {
            if ((numbers[i] % 2!=1) && (numbers[i]<100) ) {
                k++;
                myArray[k]=numbers[i];
            }
        }
       return myArray;
    }

    public static void printNames() {
       // Вывести все элементы массива names
        for (int i=0;i!=names.length;i++)
        {
            System.out.println(names[i]);
        }
    }

    private static int getCount() {
        // Вернуть количество цифр, которые делятся на 3 и 7 без остатка в массиве numbers
        int k=0;
        for (int i=0;i!=numbers.length;i++)
        {
            if ((numbers[i] % 3==0) && (numbers[i]%7==0) )
            {
                  k++;
            }
        }
        return k;
    }

    public static void printCounts()
    {
        // СЛОЖНОЕ ЗАДАНИЕ
        // Вывести количество всех цифр в массиве numbers
        // Допустим [1, 1, 1, 2, 2, 3, 3, 3, 4]
        // Значит надо вывести 1:3 2:2 3:3 4:1
        for (int i=0;i!=numbers.length;i++) {
            int k=1;
            int s=0;
            for (int f=0;f!=i;f++) {
                if ((numbers[i] == numbers[f]) || (i==f)) {s++;}
            }
            if (s==0) {
                for (int j = i; j != numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        k++;
                    }
                }
                System.out.println(numbers[i] + ":" + k);
            }
        }
    }
}
