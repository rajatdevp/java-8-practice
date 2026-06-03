package in.rajat.level_2.day_7;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Median {

    public static void main(String[] args) {

        List<Integer> nums1 = List.of(10,30,50);
        List<Integer> nums2 = List.of(20,40,60,70);

        Optional<Integer> result = Stream.of(nums1, nums2)
                .flatMap(List::stream)
                .sorted()
                .limit(nums1.size()+nums2.size()/2-1)
                .max(Integer::compareTo);

        System.out.println(result.orElse(0));

    }
}
