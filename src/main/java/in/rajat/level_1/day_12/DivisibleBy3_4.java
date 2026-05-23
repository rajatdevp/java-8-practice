package in.rajat.level_1.day_12;

import java.util.List;
import java.util.function.Predicate;

public class DivisibleBy3_4 {

    public static void main(String[] args){

        Predicate<Integer> isDivisibleBy3 = (num -> num % 3 == 0);
        Predicate<Integer> idDivisibleBy5 = (num -> num % 5 == 0);
        Predicate<Integer> isDivisibleBy3And5 = isDivisibleBy3.and(idDivisibleBy5);

        List<Integer> nums = List.of(15, 30, 45, 60, 75);

        List<Integer> result = nums.stream()
                .filter(isDivisibleBy3And5)
                .toList();

        System.out.println(result);
    }
}
