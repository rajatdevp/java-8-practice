package in.rajat.day_2;

import java.util.List;
import java.util.function.Predicate;

public class EvenGreat10 {

    public static void main(String[] args){
        //Find even numbers greater than 10
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        Predicate<Integer> isEven = (n -> n % 2 == 0);
        Predicate<Integer> isGreaterThan10 = (n -> n > 10);
        //Function chaining
        Predicate<Integer> evenNumbersGreaterThan10 = isEven.and(isGreaterThan10);


        List<Integer> result = numbers.stream().filter(evenNumbersGreaterThan10).toList();
        System.out.println(result);
    }
}
