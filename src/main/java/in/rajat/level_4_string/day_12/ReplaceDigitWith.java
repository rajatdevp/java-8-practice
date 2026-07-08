package in.rajat.level_4_string.day_12;

import java.util.List;

public class ReplaceDigitWith {

    public static void main(String[] args){

        List<String> words = List.of("java8", "code2025");

        List<String> result = words.stream()
                .map(s-> s.replaceAll("[0-9]", "#"))//instead  of [0-9] we also use "\\d"
                .toList();

        System.out.println(result);
    }
}
