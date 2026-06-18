package in.rajat.level_4_string.day_4;

import java.util.Comparator;
import java.util.List;

public class SortByLastCharacter {

    public static void main(String[] args){

        List<String> words = List.of("apple", "banana", "cherry", "date");

       List<String> result = words.stream().sorted(
               Comparator.comparing(a -> Character.toString(a.charAt(a.length() - 1))))
               .toList();

       List<String> optimalResult = words.stream()
               .sorted(
                       Comparator.comparingInt(s-> s.charAt(s.length()-1)))
               .toList();

    System.out.println(result);
    System.out.println(optimalResult);
    }
}
