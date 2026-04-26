package in.rajat.day_5;

import java.util.Arrays;
import java.util.List;

//Find numbers ending with digit '0'
public class EndsWith0 {

    public static void main(String[] args){

        int[] nums = {10, 20, 25, 30, 40, 50, 35};

        List<Integer> result = Arrays.stream(nums)
                                      .filter(n -> n % 10 == 0).boxed()
                                      .toList();
        System.out.println(result);

        Arrays.stream(nums)
                .filter(n -> String.valueOf(n).endsWith("0"))
                .forEach(System.out::println);

    }
}
