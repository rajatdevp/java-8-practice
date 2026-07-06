package in.rajat.level_4_string.day_10;

import java.util.List;

public class RemoveWhitespace {

    public static void main(String[] args){

        List<String> words = List.of("Java 8", "Hello World");

        List<String> result = words.stream()
                .map(s-> s.replace(" ", ""))
                .toList();

        System.out.println(result);
    }
}
