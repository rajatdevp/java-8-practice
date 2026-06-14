package in.rajat.level_4_string.day_2;

import java.util.List;

/*
Remove duplicates from list of strings (preserve order)
 */
public class RemoveDuplicate {

    public static void main(String[] args){

        List<String> words = List.of("apple", "banana", "apple", "cherry", "banana");

        List<String> distinctResult = words.stream()
                .distinct()
                .toList();


        System.out.println(distinctResult);
    }
}
