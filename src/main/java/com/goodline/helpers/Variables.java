package com.goodline.helpers;

import static com.goodline.helpers.Utils.generateRandomNames;
import static com.goodline.helpers.Utils.generateRandomNumbers;

public class Variables {
    public static String[] names;
    public static int[] numbers;

    static {
        names = generateRandomNames();
        numbers = generateRandomNumbers(10000);
    }
}
