package in.rajat.level_2.day_7;

import java.util.List;

public class GreaterThenAvgAndEven {

    public static void main(String[] args){

        List<Integer> nums = List.of(10,20,30,40,50);

        double avg =nums.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        List<Integer> result = nums.stream()
                .filter(num -> num % 2 == 0 && num > avg )
                .toList();

        System.out.println(result);
        //[40, 50]
    }
}
