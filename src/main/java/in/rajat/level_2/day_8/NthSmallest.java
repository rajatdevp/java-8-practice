package in.rajat.level_2.day_8;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class NthSmallest {

    public static void main(String[] args){

        List<Integer> nums = List.of(50,10);
        List<Integer> nums2 = List.of(30,20);
        int n = 3;

       Optional<Integer> result =  Stream.of(nums, nums2)
                .flatMap(List::stream)
                .sorted()
                .skip(n-1)
                .findFirst();

       System.out.println(result.orElse(0));

    }
}
