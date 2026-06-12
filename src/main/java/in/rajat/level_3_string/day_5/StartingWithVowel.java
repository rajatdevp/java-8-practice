package in.rajat.level_3_string.day_5;

import java.util.List;



public class StartingWithVowel {

    public static void main(String[] args){
        List<String> words = List.of("apple","banana","egg","orange");

        List<String> result = words.stream()
                .filter(word -> "aeiou".indexOf(word.charAt(0))>=0)
                .toList();
        System.out.println(result);

        List<String> endsWith = words.stream()
                .filter(word -> "aeiou".indexOf(word.charAt(word.length()-1))>=0)
                .toList();
        System.out.println(endsWith);
    }
}
