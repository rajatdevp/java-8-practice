package in.rajat.day_7;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Find second highest number (handle duplicates)
public class SecondHighest {

    public static void main(String[] aa) {
        List<Integer> nums = List.of(75, 50, 65, 35, 20, 65, 10);

        Optional<Integer> optionalResult =  nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(optionalResult.orElse(null));
    }
}
