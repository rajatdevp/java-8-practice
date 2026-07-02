package in.rajat.level_4_string.day_8;

import java.util.List;
import java.util.stream.Collectors;

public class JoinPrefixSuffix {

    public static void main(String[] args) {

        List<String> words = List.of("Java", "8", "is", "great");

        String result = words.stream().collect(Collectors.joining("#", "\"","\""));

        System.out.println(result);
    }
}
