package in.rajat.level_4_string.day_10;

import java.util.List;

public class RotationOfEachOther {

    public static void main(String[] args) {

        List<String> words = List.of("abc", "bca", "cab", "hello");

       List<String> result = words.stream().filter(s1->
                words.stream().anyMatch(
                        s2-> !s1.equals(s2)
                              && s1.length() == s2.length()
                              && (s1+s1).contains(s2))
        ).toList();

       System.out.println(result);
    }
}
