package in.rajat.day_7;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class MaxOfList {
    public static void main(String[] st){

        int[] nums = new int[]{4, 54, 56, 3,75, 5, 14};
        OptionalInt result = Arrays.stream(nums).max();
        result.ifPresentOrElse(  System.out::println, () -> System.out.print("no"));
        //method2

        Optional<Integer> result2 = Arrays.stream(nums).boxed().max(Integer::compareTo);
    }
}
