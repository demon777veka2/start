package com.goodline.helpers;

import java.util.Random;

public class Utils {
    public static String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public static String[] generateRandomNames() {
        int length = new Random().nextInt(100);
        String[] result = new String[length];
        for(int i = 0; i < length; i++) {
            result[i] = generateRandomString();
        }
        return result;
    }

    public static int[] generateRandomNumbers(int length) {
        int[] result = new int[length];
        Random rnd = new Random();
        for(int i = 0; i < length; i++) {
            result[i] = rnd.nextInt(100);
        }
        return result;
    }
}
