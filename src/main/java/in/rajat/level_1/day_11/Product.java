package in.rajat.level_1.day_11;

import java.util.List;
import java.util.Optional;

//Product of list
//Sum of list
//Table of number
public class Product {
    public static void main(String[] args){

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int result1 = nums.stream().
                reduce(1, (a,b) -> a*b);
        System.out.println(result1);

        Optional<Integer> result2 = nums.stream()
                .reduce((a,b) -> a*b);
        System.out.println(result2.get());

        Optional<Integer> resultSum = nums.stream()
                .reduce((a,b) -> a+b);
        resultSum.ifPresent(System.out::println);//45

        Optional<Integer> resultSum2 = nums.stream()
                .reduce(Integer::sum);
        resultSum2.ifPresent(System.out::println);//
    }
}
