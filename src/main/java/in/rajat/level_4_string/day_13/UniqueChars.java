package in.rajat.level_4_string.day_13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueChars {

    public static void main(String[] args) {

        List<String> words = List.of("java", "guides");

Long result = words.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue() == 1).count();

System.out.println(result);

    }
}
