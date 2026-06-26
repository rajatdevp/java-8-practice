package in.rajat.level_4_string.day_7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByVowelOrConsonant {

    public static void main(String[] args) {

       List<String> words = List.of("apple", "banana", "egg", "orange", "sky");
       Map<Boolean, List<String>>  result = words.stream()
               .collect(Collectors.partitioningBy(word-> "aeiou".indexOf(word.charAt(0))>-1));

       System.out.println(result);
    }
}
