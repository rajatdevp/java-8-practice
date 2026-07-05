package in.rajat.level_4_string.day_9;

import java.util.Arrays;
import java.util.List;

public class TotalWord {

    public static void main(String[] args){

        List<String> words = List.of("Hello world", "Java 8 Streams");
        long result = words.stream()
                .map(s -> s.split("\\s+"))
                .flatMap(Arrays::stream)
                .count();
        System.out.println(result);

        Long result2 = words.stream()
                .flatMap(
                        s-> Arrays.stream(s.split("\\s+")))
                .count();

        System.out.println(result2);
    }
}
