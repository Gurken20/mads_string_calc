package io.calculator;

import java.util.Arrays;

public class StringCalculator {

    public int add(String input) {
        String[] numbers;
        //if (input.contains("\\n")) {
        //    numbers = input.split("\\\\n");
        //} else {
        //}
        numbers = input.split(",|\\\\n");
        int total = 0;
        for (String number : numbers) {
            try {
                total = total + Integer.parseInt(number);
            } catch (Exception e) {

            }
        }
        return total;
    }
}