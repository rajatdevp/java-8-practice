package in.rajat.level_2.day_3;

import java.util.List;

public class Fatten3LevelList {

    public static void main(String[] args) {
        List<List<?>> nums = List.of(
                List.of(1, 2, 3),
                List.of(4, List.of(5, 6)),
                List.of(7, 8, 9)
        );

        int result = nums.stream().flatMap(List::stream).flatMap(num -> {
            if (num instanceof List) {
                return ((List<?>) num).stream();
            } else {
                return List.of(num).stream();
            }
        }).mapToInt(num -> (int) num).sum();

        System.out.println(result);

    }
}
