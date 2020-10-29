package edu.learnings.codewars;

import java.util.Arrays;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        int minVal = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
        int maxVal = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
        return maxVal + " " + minVal;
    }

    public static void main(String [] args){
        System.out.println(highAndLow("1 2 3 4 5"));
    }
}
