package in.rajat.level_4_string.day_9;

import java.util.List;

public class VowelsMoreThenConsonants {

    public static String VOWELS = "aeiou";

    public static void main(String[] args) {

        List<String> words = List.of("education", "sky", "beautiful");

        List<String> result = words.stream()
                .filter(word ->{
                    long vowelCount = word.chars()
                            .filter(c -> VOWELS.indexOf(c) >= 0)
                            .count();
                    return vowelCount > word.length() - vowelCount;
                })
                .toList();

        System.out.println(result);
    }
}
