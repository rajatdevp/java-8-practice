package in.rajat.level_4_string.day_6;

import java.util.Comparator;
import java.util.List;

public class SortAlphabetically {
    public static void main(String[] args) {

        List<String> words = List.of("Banana", "apple", "Cherry", "date");
       List<String> result = words.stream()
               .sorted(
                       Comparator.comparingInt(s -> s.toLowerCase().charAt(0))
               ).toList();
       System.out.println(result);

       //
       List<String> better = words.stream().sorted(Comparator.comparing(String::toLowerCase)).toList();
       System.out.println(better);
       //
       List<String> best = words.stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
       System.out.println(best);
    }
}
