package in.rajat.level_4_string.day_6;

import java.util.List;

public class CountCharacters {

    public static void main(String[] args) {

        List<String> words = List.of("java", "guides", "streams");

       long result = words.stream().flatMapToInt(String::chars).count();

        System.out.println(result);
    }
}
