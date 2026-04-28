package in.rajat.day_7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy50 {
    //Separate odd and even using partitioningBy
    public static void main(String[] arr){

    List<Integer> nums = List.of(40, 55, 60, 45, 70, 30, 65);
    Map<Boolean, List<Integer>> result = nums.stream()
            .collect(Collectors.partitioningBy(n -> n<=50));
    System.out.println(result);
    //{false=[55, 60, 70, 65], true=[40, 45, 30]}
    }
}
