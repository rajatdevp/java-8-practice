package in.rajat.level_4_string.day_4;

import java.util.List;

public class FirstAndLastLeterSame {

    public static void main(String[] args) {
        List<String> words = List.of("radar", "level", "hello", "kayak");

        List<String> result = words.stream()
                .filter(word -> word.charAt(0) == word.charAt(word.length() - 1))
                .toList();

        System.out.println(result);
    }
}
