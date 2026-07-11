package in.rajat.level_4_string.day_13;

import java.util.List;

public class OneDigitOneLetter {

    public static void main(String[] args) {
        List<String> list = List.of("java8", "hello", "2025");

        List<String> validStrings = list.stream()
                .filter(str ->
                        str.chars().anyMatch(Character::isLetter) &&
                        str.chars().anyMatch(Character::isDigit))
                .toList();

        System.out.println(validStrings);
    }
}
