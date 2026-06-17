package in.rajat.level_4_string.day_3;

import java.util.List;

public class Length10 {
    public static void main(String[] args) {
        List<String> arr = List.of("short", "thisislongstring", "medium", "verylongstringexample");

       List<String> result =  arr.stream()
               .filter(s-> s.length()>10)
               .toList();

       System.out.println(result);
    }
}
