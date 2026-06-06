package in.rajat.level_3_string.day_1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {

    public static void main(String[] args){

        String str = "Java is great. Java is fun";

        str = str.replaceAll("[^a-zA-Z0-9 ]", "");

       Map<String,Long> result = Arrays.stream(str.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       System.out.println(result);

    }
}
