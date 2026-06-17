package in.rajat.level_4_string.day_3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupFirstCharacter {

    public static void main(String[] args) {

        List<String> arr = List.of("apple", "banana", "avocado", "blueberry", "cherry");

        Map<Character, List<String>> result = arr.stream()
                .collect(Collectors.groupingBy(s-> s.charAt(0)));

        System.out.println(result);
    }
}
