package com.mediumSiteCodes.basicProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// impByNitish http://www.techiedelight.com/find-largest-number-possible-set-given-numbers/
public class LargestNumPossible {
    public static void main(String[] args) {
        int[] arr = {10, 68, 75, 7, 21, 12};
        largestNumPossible(arr);
    }

    private static void largestNumPossible(int[] arr) {
        List<String> numbers = Arrays.asList("10", "68", "75", "7", "21", "12");

        Collections.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

        numbers.stream().forEach(num -> System.out.print(num));
    }
}
