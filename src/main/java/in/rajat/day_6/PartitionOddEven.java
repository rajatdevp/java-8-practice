package in.rajat.day_6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

//Separate odd and even using partitioningBy
public class PartitionOddEven {

    public static void main(String[] args){

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        Map<Boolean, List<Integer>> result= Arrays.stream(nums)
                .boxed()
                .collect(Collectors.partitioningBy(n -> n%2 == 0));

        System.out.println(result);
        //false: [1,3,5,7], true: [2,4,6,8]
    }
}
