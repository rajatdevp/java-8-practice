package in.rajat.day_11;

import java.util.List;
import java.util.stream.Collectors;

//skip first 5 elements and take next 10
public class SkipAndTake {

    public static void main(String[] args){

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        List<Integer> result = numbers.stream()
                .skip(5).collect(Collectors.toList());

        System.out.println(result);
    }
}
