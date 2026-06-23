package in.rajat.level_4_string.day_6;

import java.util.List;
import java.util.function.Predicate;

public class Palindromes {

    public static void main(String[] args) {

        Predicate <String> isPalindromes = str -> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());

        List<String> words =List.of("radar", "hello", "level", "world");

        List<String> result = words.stream().filter(isPalindromes).toList();

        System.out.println(result);
    }
}
