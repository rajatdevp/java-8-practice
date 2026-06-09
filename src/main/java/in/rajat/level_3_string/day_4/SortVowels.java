package in.rajat.level_3_string.day_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortVowels {
    public static void main(String[] args) {

        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
        List<String> strs = List.of("sky","apple","banana","egg");

        Comparator<String> stringComparator = Comparator.comparing( str-> str.chars()
                .filter(ch-> "aeiou".indexOf(ch) !=-1).count());

        List<String> sortedStrs = strs.stream().sorted(Comparator.comparing(str -> {
            return str.chars().filter(ch -> vowels.contains(String.valueOf((char) ch))).count();
        })).toList();

        List<String> result2 = strs.stream()
                .sorted(stringComparator)
                .toList();

        System.out.println(sortedStrs);
        System.out.println(result2);
    }
}
