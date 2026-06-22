package in.rajat.level_4_string.day_5;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MaximumVowel {

    public static void main(String[] args) {

        List<String> words = List.of("education", "beautiful", "apple");

        Function<String ,Long> count = word -> word.chars()
                .filter( ch ->"aeiou".indexOf(ch) ==-1)
                .count();

        Optional<String> result =  words.stream().max(Comparator.comparing(count));

        System.out.println(result.orElse(""));

         
    }
}
