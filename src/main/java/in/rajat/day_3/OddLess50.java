package in.rajat.day_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class OddLess50 {

    public static void main(String[] args){
        //Find odd numbers less than 50
        int[] arr = {10, 25, 45, 55, 65, 35, 75};
        Predicate<Integer> isOdd = n -> n%2!=0;
        Predicate<Integer> isLessThen50 = n -> n < 50;

        Predicate<Integer> isOddAndLessThan50 = isOdd.and(isLessThen50);

        List<Integer> result =Arrays.stream(arr).boxed().filter(isOddAndLessThan50).toList();
        System.out.println(result);

        IntPredicate isOddInt = n -> n%2!=0;
        IntPredicate isLessThen50Int = n -> n < 50;
        IntPredicate isOddAndLessThan50Int =  isOddInt.and(isLessThen50Int);
        List<Integer> result2 = Arrays.stream(arr).filter(isOddAndLessThan50Int).boxed().toList();
        System.out.println(result2);


    }
}
