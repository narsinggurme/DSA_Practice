package com.march;

import java.util.Arrays;
import java.util.Comparator;

public class MinMaxAndSecondLargeUsingStream {

    public static void main(String[] args) {
        int [] arr = {1,2,3,1,2,0,19,18};

        int min = Arrays.stream(arr).min().orElseThrow();
        int max = Arrays.stream(arr).max().orElseThrow();
        int secondMax = Arrays.stream(arr)
                        .distinct()
                                .boxed()
                                        .sorted(Comparator.reverseOrder())
                                                .skip(2)
                                                        .findFirst().orElseThrow();
        int secondLargest = Arrays.stream(arr).filter(n -> n != max).max().orElseThrow();
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
        System.out.println("Second Maximum: "+secondLargest);
        System.out.println("Third Maximum: "+secondMax);


    }
}

