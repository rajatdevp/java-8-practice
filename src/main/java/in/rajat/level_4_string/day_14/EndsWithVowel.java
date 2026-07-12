package in.rajat.level_4_string.day_14;

import java.util.List;

public class EndsWithVowel {

    static String VOWELS = "aeiou";

    public static void main(String[] args){

        List<String> words =  List.of("apple", "banana", "cherry", "mango");

        List<String> result = words.stream().filter(
                word-> VOWELS.indexOf(word.charAt(word.length()-1)) != -1)
                .toList();

        System.out.println(result);
    }
}
