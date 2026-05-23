package in.rajat.level_1.day_11;

import java.util.Comparator;
import java.util.List;

public class Ascending {

    public static void main(String[] args) {
        List<Integer> nums = List.of(50, 10, 30, 20, 40);


        List<Integer> result = nums.stream().sorted().toList();
        System.out.println(result);



        List<Integer> resultDes = nums.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(resultDes);

    }
}
