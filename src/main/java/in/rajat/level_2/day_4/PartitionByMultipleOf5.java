package in.rajat.level_2.day_4;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PartitionByMultipleOf5 {

    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 15, 22, 25, 33, 35, 35);

        Map<Integer, Long> result1 = nums.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result1);

        Map<Integer, List<Integer>> result2 = nums.stream()
                .collect(Collectors.groupingBy(Function.identity()));
        System.out.println(result2);

        Map<String, List<Integer>> result3 = nums.stream()
                .collect(Collectors.groupingBy(num -> (num % 5 == 0) ? "Multiple of 5" : "Other"));

        result3.entrySet().forEach(System.out::println);
    }
}
