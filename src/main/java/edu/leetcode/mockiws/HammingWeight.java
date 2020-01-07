package edu.leetcode.mockiws;

public class HammingWeight {
    public static void main(String [] args){
        System.out.println(hammingWeight(2));
    }
    public static int hammingWeight(int n) {
        int accumulator = 0;
        for (int i = 0; i < 32; i++) {
            accumulator = accumulator + (n & 1);
            n = n >> 1;
        }
        return accumulator;
    }
}
