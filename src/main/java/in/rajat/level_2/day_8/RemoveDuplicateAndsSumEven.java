package in.rajat.level_2.day_8;

import java.util.List;

public class RemoveDuplicateAndsSumEven {

    public static void main(String[] args) {

        List<Integer> nums = List.of(2,4,2,6,8,4);

       List<Integer> result =  nums.stream()
               .distinct()
               .filter(num -> num % 2 == 0)
               .toList();

       System.out.println(result);
    }
}
