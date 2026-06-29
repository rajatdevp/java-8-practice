package in.rajat.level_4_string.day_7;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesCharacters {

    public static void main(String[] args) {

        List<String> list = List.of("banana", "apple");

       List<String> result = list.stream().map(s-> s.chars()
               .distinct()
               .mapToObj(c-> String.valueOf((char)c))
               .collect(Collectors.joining())
        ).toList();

       System.out.println(result);
    }
}
