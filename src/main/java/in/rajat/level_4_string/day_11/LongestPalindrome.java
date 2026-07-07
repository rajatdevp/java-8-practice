package in.rajat.level_4_string.day_11;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestPalindrome {


    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        List<String> list = List.of("radar", "level", "hello", "kayak", "racecar");

       Optional<String> result = list.stream()
               .filter(LongestPalindrome::isPalindrome)
               .max(Comparator.comparingInt(String::length));

       result.ifPresent(System.out::println);

    }
}
