package com.goodline.lessons;

public class BooleanLesson {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;

        int smallNumber = 1;
        int bigNumber = 1000;

        boolean not = !a; // Она будет равна false

        boolean and = a && b; // Тоже false, чтобы было true нужно чтобы обе части (a и b) были true

        boolean or = a || b; // Будет true, для || достаточно, чтобы хотя бы один из операторов был true

        boolean equal = smallNumber == bigNumber; // Будет false, потому что они не равны

        boolean notEqual = smallNumber != bigNumber; // Будет true, так как они не равны

        boolean bigger = smallNumber > bigNumber; // Будет false

        boolean smaller = smallNumber < bigNumber; // true

        boolean multiple = a || b || c; // Можно комбинировать

    }
}
