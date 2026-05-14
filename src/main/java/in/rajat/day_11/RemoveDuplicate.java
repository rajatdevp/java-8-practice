package in.rajat.day_11;

import java.util.List;

public class RemoveDuplicate {

    public static void main(String[] args){

        List<Integer> nums = List.of(10, 15, 10, 25, 15, 30);

        List<Integer> result = nums.stream().distinct().toList();

        System.out.println(result);//[10, 15, 25, 30]
    }
}
