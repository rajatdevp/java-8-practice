package in.rajat.level_4_string.day_5;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringsToString {

    public static void main(String[] args) {

        List<String> list = List.of("Java", "8", "Streams");

       String result = list.stream()
               .collect(Collectors.joining(" "));

       System.out.println(result);
    }
}
