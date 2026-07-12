package in.rajat.level_4_string.day_14;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddLength {

    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "cat", "dog");

        Map<String, Long> result = words.stream()
                .map(String::length)
                .collect(Collectors.groupingBy(
                        len->len%2==0? "Even":"Odd",
                        Collectors.counting()));

        System.out.println(result);
    }
}
