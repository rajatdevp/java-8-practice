package in.rajat.level_4_string.day_8;

import java.util.List;

public class AllEvenLength {
    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "cherry");

        boolean result =  words.stream().allMatch(word -> word.length() % 2 == 0);

        System.out.println(result);
    }
}
