package in.rajat.level_4_string.day_1;

import java.util.List;

public class ContainsDigits {

    public static void main(String[] args) {

       List<String> words = List.of("java8", "code2025", "stream", "java17");

       List<String> regXResult =  words.stream()
               .filter(word -> word.matches(".*\\d+.*"))
               .toList();

       System.out.println(regXResult);

       List<String> streamResult =  words.stream()
               .filter(word -> word.chars().anyMatch(Character::isDigit))//anyMatch return true if IntStream have digit
               .toList();

       System.out.println(streamResult);

    }
}
