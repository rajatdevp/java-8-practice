package in.rajat.level_2.day_8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Partition into numbers <25 and >=25
public class PartitionByN {
    public static void main(String[] args){

        List<Integer> nums = List.of(10,30,20,40,15);

        Map<String, List<Integer>> result = nums.stream()
                .collect(Collectors.groupingBy(num -> num >= 25? "Greater then 25" : "Less then 50" ));

        System.out.println(result);
         //{Greater then 25=[30, 40], Less then 50=[10, 20, 15]}
    }
}
