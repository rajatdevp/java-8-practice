package in.rajat.level_4_string.day_7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByVowelOrConsonant {

    static String  VOWEL = "aeiou";
    public static void main(String[] args) {


       List<String> words = List.of("apple", "banana", "egg", "orange", "sky");

       Map<Boolean, List<String>>  result = words.stream()
               .collect(Collectors.partitioningBy(word-> VOWEL.indexOf(word.charAt(0))>-1));

        Map<String, List<String>> result2 = words.stream().collect(
                Collectors.groupingBy(word ->VOWEL.indexOf(word.charAt(0))>=0
                ?"Vowel"
                : "Consonant"));
       //words.stream().

       System.out.println(result);
       System.out.println(result2);
    }
}
