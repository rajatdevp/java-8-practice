package in.rajat.level_4_string.day_3;

import java.util.List;
//Replace specific character in all strings
//["apple", "banana", "cherry"], replace 'a' with '@'
public class ReplaceWithChar {

    public static void main(String[] args) {

        List<String> words  = List.of("apple", "banana", "cherry");

        List<String> result = words.stream()
                .map(s-> s.replace("a", "@"))
                .toList();

        System.out.println(result);
    }
}
