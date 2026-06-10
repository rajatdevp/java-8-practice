package in.rajat.level_3_string.day_4;

import java.util.List;

public class RemoveVowel {

    public static void main(String[] args) {

        List<String> words = List.of("apple","banana","cherry");

        List<String> result = words.stream()
                .map(word -> word.replaceAll("[aeiou]", ""))
                .toList();

        System.out.println(result);

    }
}
