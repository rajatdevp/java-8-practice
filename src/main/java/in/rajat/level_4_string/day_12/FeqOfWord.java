package in.rajat.level_4_string.day_12;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FeqOfWord {

    public static  void main(String[] args) {

       String words = "Hello, world! Hello again.";
       Map<String, Long> result =  Arrays.stream(words.split("\\s+"))
                .map(s->s.replaceAll("[^a-z0-9A-Z]", "").toLowerCase())
                .collect(
                        Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                                Collectors.counting()));
       System.out.println(result);
    }
}
