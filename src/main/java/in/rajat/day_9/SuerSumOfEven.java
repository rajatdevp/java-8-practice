package in.rajat.day_9;

import java.util.Arrays;
import java.util.function.IntPredicate;

//Find sum of squares of even numbers
public class SuerSumOfEven {

    public static void main(String[] args){

       int[] nums = {1, 2, 3, 4, 5, 6};

        IntPredicate even = num -> num % 2 == 0;

        int result = Arrays.stream(nums)
                .map(num -> num * num)
                .filter(even)
                .sum();

        System.out.println(result);
        //56
    }
}
