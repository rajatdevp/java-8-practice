package in.rajat.level_2.day_1;

import java.util.List;

public class CubeTheNumber {

    public static void main(String[] args){

        List<Integer> nums = List.of(3,4,5,6,7,8);

        List<Integer> result = nums.stream()
                .map(num -> num * num * num)
                .filter(num -> num > 200)
                .toList();

        System.out.println(result);
    }
}
