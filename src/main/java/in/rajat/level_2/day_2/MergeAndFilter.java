package in.rajat.level_2.day_2;

import java.util.List;
import java.util.stream.Stream;
//Find count of numbers between 30 and 70 after merge
public class MergeAndFilter {

    public static void main(String[] args) {

        List<Integer> nums = List.of(20, 40, 60);
        List<Integer> nums2 = List.of(25, 55, 75);

       Long result = Stream.of(nums, nums2)
                .flatMap(List::stream)
                .filter(num -> num > 20 && num < 70).count();

        System.out.println(result);//[40, 60, 25, 55]

    }
}
