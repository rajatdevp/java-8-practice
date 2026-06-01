package in.rajat.level_2.day_6;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxProduct {

    public static void main(String[] args) {
        List<Integer> nums = List.of(10,20,5,30,15);

        int max = nums.stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .reduce(1, (x, y) -> x * y);//wrong contains


        int maxProduct = nums.stream()
                .flatMap(num1 -> nums.stream().map(num2 -> num1 * num2))
                .max(Integer::compareTo)
                .orElse(0);//wrong contains duplicates multiple

      Optional<Integer> result  = nums.stream()
                .flatMap(num1 -> nums
                        .stream()
                        .filter(num2 -> !num2.equals(num1))
                        .map(num2 -> num1*num2)).max(Integer::compareTo);//correct

      System.out.println(result.orElse(0));
      //System.out.println(maxProduct);


    }
}
