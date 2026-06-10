package in.rajat.level_3_string.day_4;

import java.util.List;
import java.util.OptionalDouble;

public class AverageLength {

    public static void main(String[] args){

        List<String> words = List.of("apple","banana","cherry");

        OptionalDouble result = words.stream()
                .mapToInt(String::length)
                .average();

        System.out.println(result.orElse(0.0));
    }
}
