package in.rajat.level_4_string.day_8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfVowel {

    public static void main(String[] args) {

       List<String> words = List.of("apple", "banana", "cherry");
       Map<String, Long> result = new LinkedHashMap<>();

        for (char ch : "aeiou".toCharArray()) {
            result.put(ch+"", 0L);
        }


        Map<String,Long> resultTemp= words.stream()
               .map(str->str.split(""))
               .flatMap(Arrays::stream)
               .filter("aeiou"::contains)
               .collect(Collectors.groupingBy(
                       Function.identity(),
                       Collectors.counting()));

    result.putAll(resultTemp);
    System.out.println(result);
    }
}
