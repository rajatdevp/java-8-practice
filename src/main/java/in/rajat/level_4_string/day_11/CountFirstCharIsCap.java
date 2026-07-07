package in.rajat.level_4_string.day_11;

import java.util.List;

public class CountFirstCharIsCap {

    public static void main(String[] args) {

        List<String> list = List.of("Java", "guides", "Stream", "api");

       long result =  list.stream()
               .filter(s-> Character.isUpperCase(s.charAt(0)))
               .count();

       System.out.println(result);
    }
}
