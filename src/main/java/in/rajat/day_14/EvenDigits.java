package in.rajat.day_14;

import java.util.List;
import java.util.function.Predicate;

public class EvenDigits {

    public static void main(String[] args){

        List<Integer> nums = List.of(10, 100, 999, 1000, 55);

        Predicate<Integer> isEvenDigit = num -> {
            int count = 0;
            while(num>0){
                num = num/10;
                count++;
            }
            return count % 2 == 0;
        };

        List<Integer> result = nums.stream()
            .filter(isEvenDigit)
                .toList();

        System.out.println(result);
    }
}
