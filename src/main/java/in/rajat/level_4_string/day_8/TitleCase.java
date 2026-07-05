package in.rajat.level_4_string.day_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TitleCase {
    public static void main(String[] args) {

        List<String> words = List.of("java guides", "stream api");

       List<String> result = words.stream().map(
                word -> Arrays.stream(word.split(" "))
                        .map(w-> Character.toUpperCase(w.charAt(0))+w.substring(1))
                        .collect(Collectors.joining(" "))).toList();

       System.out.println(result);
    }
}
