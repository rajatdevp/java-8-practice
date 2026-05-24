package in.rajat.level_2.day_0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeAndEven {
    public static void main(String[] args){

        List<Integer> nums1 = Arrays.asList(1,2,3,4);
        List<Integer> nums2 = List.of(5,6,7,8);
        List<Integer> nums3 = List.of(9,10,11,12);

        List<Integer> result = Stream.concat(
                Stream.concat(nums1.stream(), nums2.stream()), nums3.stream())
                .filter(num-> num %2 == 0).toList();

        System.out.println(result);
    }
}
