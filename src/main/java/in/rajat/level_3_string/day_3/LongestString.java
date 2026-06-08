package in.rajat.level_3_string.day_3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {

    public static void main(String[] args){

        List<String> list = List.of("apple","banana","cherry","date");

       Optional<String> result = list
                .stream()
                .max(Comparator.comparingInt(String::length));

       Optional<String> result2 =  list.stream()
               .reduce((w1,w2) -> w1.length() >= w2.length()?w1:w2);

       Optional<String> result3 = list.stream()
               .sorted(Comparator.comparingInt(String::length).reversed())
               .findFirst();

        System.out.println(result.orElse(null));
        System.out.println(result2.orElse(null));
        System.out.println(result3.orElse(null));
    }
}
