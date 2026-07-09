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

       List<String> result1 = words.stream()
               .sorted(Comparator.<String>naturalOrder().reversed())
               .toList();

       System.out.println(result1);

       List<String> result3 = words.stream().
               sorted((a,b)-> b.compareTo(a))
               .toList();

       System.out.println(result3);

      List<String> result4 = words.stream()
              .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
              .toList();
      System.out.println(result4);
    }

}
