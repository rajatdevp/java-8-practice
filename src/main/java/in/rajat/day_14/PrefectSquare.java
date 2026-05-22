package in.rajat.day_14;

import java.util.List;
import java.util.function.Predicate;

public class PrefectSquare {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 4, 9, 16, 20, 25);

        Predicate<Integer> isPerfectSquare = num -> {
            int sqrt = (int) Math.sqrt(num);
            return sqrt * sqrt == num;
        };

        List<Integer> result = nums.stream()
                .filter(isPerfectSquare)
                .toList();

        System.out.println(result);
    }

}
