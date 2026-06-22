package in.rajat.level_4_string.day_5;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByVowel {

    static String VOWEL = "aeiou";

    public static void main(String[] args){

       List<String> words = List.of("apple", "banana", "sky", "queen");


       Function<String,Long> vowels = word -> word.chars()
               .filter(ch-> VOWEL.indexOf(ch)!=-1)
               .count();

       Map<Long, List<String>> result  = words.stream()
               .collect(Collectors.groupingBy(vowels));

       System.out.println(result);
    }
}
