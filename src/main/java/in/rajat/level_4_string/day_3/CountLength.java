package in.rajat.level_4_string.day_3;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountLength {

    public static void main(String[] args){

        String str = "Java 8 Streams are powerful";

        Map<String,Integer> result = Arrays.stream(str.split(" "))
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(result);
    }
}
