package in.rajat.level_1.day_13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstAndLast {

    public static void main(String[] args) {

        List<Integer> nums =  List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        List<Integer> first10 = nums.stream()
                .limit(10)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(first10);

        List<Integer> last5 = nums.stream()
                .skip(nums.size()-5)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(last5);
    }
}
