package in.rajat.level_3_string.day_3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ShortestString {

    public static void main(String[] args){

        List<String> list = List.of("apple","banana","cherry","date", "pack");

        Optional<String> optional = list.stream()
                .reduce((s1, s2) -> s1.length() <= s2.length() ? s1 : s2);

        Optional<String> result = list.stream().min(Comparator.comparingInt(String::length));

        System.out.println(result.orElse(null));
        System.out.println(optional.get());
    }
}
