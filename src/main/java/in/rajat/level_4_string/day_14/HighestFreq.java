package in.rajat.level_4_string.day_14;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestFreq {

    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "cat", "dog");

        Optional<Map.Entry<String, Long>> result = words.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        str -> str.chars()
                .filter(ch -> ch == 'a')
                .count()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        result.ifPresent(System.out::println);

        //better for interview

       Optional<String> betterResult =  words.stream()
               .max(Comparator.comparingLong(
                       str-> str.chars().filter(ch-> 'a' == ch).count()));

       betterResult.ifPresent(System.out::println);
    }
}
