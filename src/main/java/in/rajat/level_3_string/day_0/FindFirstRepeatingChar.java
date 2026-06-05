package in.rajat.level_3_string.day_0;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstRepeatingChar {
    public static void main(String[] args){

        String str = "JavaGuides";

        Optional<Map.Entry<String,Long>> result =Stream.of(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .findFirst();

        System.out.println(result.get().getKey());

    }
}
