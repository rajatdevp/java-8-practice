package in.rajat.level_4_string.day_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TitleCase {
    public static void main(String[] args) {

        List<String> words = List.of("java guides", "stream api");

       List<String> result = words.stream().map(
               sentence -> Arrays.stream(sentence.split(" "))
                        .map(word-> Character.toUpperCase(word.charAt(0))+word.substring(1))
                        .collect(Collectors.joining(" "))).toList();

       System.out.println(result);
    }
}
