package xplore.learnings.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReversedSequence {
    public static int[] reverse(int n) {
        return IntStream.iterate(n, e -> e - 1).limit(n).toArray();
    }

    public static void main(String[] args) {

        Arrays.stream(reverse(5))
                .forEach(System.out::println);
    }

}
