package in.rajat.level_2.day_2;

import java.util.List;
import java.util.Optional;

//Find product of even numbers from merged list
public class EvenAndProduct {

    public static void main(String[] args){

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        Optional<Integer> result =  nums.stream()
                .filter(num -> num % 2 == 0)
                .reduce((a, b) -> a*b);

        System.out.println(result.orElse(0));
        //48
    }
}
