package in.rajat.level_4_string.day_11;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinimumLength {
    public static void main(String[] args){

        List<String> list = List.of("apple", "banana", "cherry", "date");

        Optional<String> result = list.stream()
                .min(Comparator.comparingInt(String::length));

        result.ifPresent(System.out::println);

    }
}
