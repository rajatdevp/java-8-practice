package in.rajat.level_4_string.day_10;

import java.util.Comparator;
import java.util.List;

public class SortByUniqueChars {

    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "cherry");

        List<String> result = words.stream().sorted((a, b)->
                Math.toIntExact(b.chars().distinct().count()-a.chars().distinct().count()))
                .toList();
        System.out.println(result);

        List<String> resultOpt = words.stream()
                .sorted(Comparator.comparingLong((String s)-> s.chars().distinct().count()).reversed())
                .toList();

        System.out.println(resultOpt);

    }
}
