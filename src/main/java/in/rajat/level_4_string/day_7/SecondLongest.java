package in.rajat.level_4_string.day_7;

import java.util.List;
import java.util.Optional;

public class SecondLongest {

    public  static void main(String[] args) {

       List<String> words = List.of("apple", "banana", "cherry", "date", "watermelon");
       Optional<String> result = words.stream()
               .sorted((s1, s2) -> s2.length() - s1.length())
               .skip(1)
               .findFirst();

       result.ifPresent(System.out::println);
    }
}
