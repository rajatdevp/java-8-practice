package in.rajat.level_4_string.day_4;

import java.util.List;

public class CountConsonantsStrings {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry");

        long result = words.stream()
                .flatMapToInt(String::chars)
                .filter(ch-> "aeiou".indexOf(ch)==-1)
                .count();

        System.out.println(result);
    }
}
