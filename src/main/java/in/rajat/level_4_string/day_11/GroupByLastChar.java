package in.rajat.level_4_string.day_11;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLastChar {

    public static void main(String[] args){

        List<String> list = List.of("apple", "banana", "cherry", "date");

       Map<Character, List<String>> result =
               list.stream()
                       .collect(Collectors.groupingBy(
                       s-> s.charAt(s.length()-1)));
       System.out.println(result);
    }
}
