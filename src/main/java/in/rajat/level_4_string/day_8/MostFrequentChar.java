package in.rajat.level_4_string.day_8;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentChar {
    public static void main(String[] args) {
        List<String> words = List.of("java", "guides", "streams");

       Optional<Map.Entry<String, Long>> result = words.stream()
                .map(str-> str.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream().max(Map.Entry.comparingByValue());

       result.ifPresent(System.out::println);
    }
}
