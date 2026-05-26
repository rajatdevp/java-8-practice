package in.rajat.level_2.day_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MargeAndDivisibleBy7 {

    public static void main(String[] args){

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> result = Stream.concat(list.stream(), list2.stream())
                .filter(num -> num % 7 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(result);
    }
}
