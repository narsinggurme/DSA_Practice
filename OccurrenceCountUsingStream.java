package com.march;
import java.util.*;
import java.util.stream.Collectors;

public class OccurrenceCountUsingStream {

    public static Map<String,Long> countOccurrence(String[] arr)
    {
        return Arrays.stream(arr)
                .filter(Objects::nonNull).map(s -> s.trim().toLowerCase(Locale.ROOT))
                .collect(Collectors.groupingBy(s -> s, TreeMap:: new, Collectors.counting()));
    }
    public static void main(String[] args) {
        String[] arr = {"Ram ", "Bharat", "Ram", "Narsing", "ram"};
        Map<String, Long> map = countOccurrence(arr);
        System.out.println(map);
    }
}
