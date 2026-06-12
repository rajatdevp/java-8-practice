package in.rajat.level_3_string.day_5;

import java.util.List;
import java.util.Optional;

public class CountVowels {
    public static void main(String[] args){

        List<String> words = List.of("apple","banana","cherry");

        Optional<Integer> result = words.stream()
                .map(word -> word.replaceAll("[^aeiou]", "").length())
                .reduce(Integer::sum);

        System.out.println(result.orElse(0));
    }
}
