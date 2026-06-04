package in.rajat.level_2.day_8;

import java.util.List;
import java.util.Optional;

public class RemoveDuplicateAndsSumEven {

    public static void main(String[] args) {

        List<Integer> nums = List.of(2,4,2,6,8,4);

       Optional<Integer>result =  nums.stream()
               .distinct()
               .filter(num -> num % 2 == 0).reduce(Integer::sum);

       System.out.println(result.orElse(0));
    }
}
