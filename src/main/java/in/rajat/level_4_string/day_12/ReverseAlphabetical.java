package in.rajat.level_4_string.day_12;

import java.util.Comparator;
import java.util.List;

public class ReverseAlphabetical {

    public static void main(String[] args){

       List<String> words = List.of("apple", "banana", "cherry");

       List<String> result =  words.stream()
               .sorted(Comparator.reverseOrder())
               .toList();

       System.out.println(result);
    }

}
