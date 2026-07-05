package in.rajat.level_4_string.day_9;

import java.util.List;

public class ContentsOnlyAlphabets {

    public static void main(String[] args) {

       List<String> words = List.of("java8", "hello", "stream123");

       List<String>  result = words.stream()
               .filter(word -> word.matches("[a-zA-Z]+"))
               .toList();

       System.out.println(result);
    }
}
