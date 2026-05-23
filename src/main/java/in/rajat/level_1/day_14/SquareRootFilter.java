package in.rajat.level_1.day_14;

import java.util.List;

public class SquareRootFilter {

    public static void main(String[] aa) {
        List<Integer> numbers = List.of(4, 9, 16, 25, 7);

        List<Integer> result = numbers.stream()
                .filter(num -> Math.sqrt(num)%1 ==0)
                .toList();

        System.out.println(result);

    }
}
