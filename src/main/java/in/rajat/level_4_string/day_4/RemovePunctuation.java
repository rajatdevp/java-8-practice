package in.rajat.level_4_string.day_4;

import java.util.List;

public class RemovePunctuation {

    public static void main(String[] args) {

        List<String> words = List.of("Hello, world!", "Java. is fun?");

        List<String> result = words.stream()
                .map(s-> s.replaceAll("\\p{P}", "")).toList();
        
        System.out.println(result);
    }
}
