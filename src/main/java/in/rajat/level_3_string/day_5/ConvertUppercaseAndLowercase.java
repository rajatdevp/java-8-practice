package in.rajat.level_3_string.day_5;

import java.util.List;

public class ConvertUppercaseAndLowercase {

    public static void main(String[] args){

        List<String> words = List.of("java","guides");

        List<String> uppercaseResult = words.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Uppercase: " + uppercaseResult);

        List<String>  lowerCaseResult  = uppercaseResult.stream()
                .map(String::toLowerCase)
                .toList();

        System.out.println("Lowercase: " + lowerCaseResult);
    }
}
