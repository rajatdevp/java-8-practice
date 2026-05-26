package in.rajat.level_2.day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAnd100 {

    public static void main(String[] args){

        List<List<Integer>> nums = Arrays.asList(
                Arrays.asList(50,120,80),
                Arrays.asList(110,90,150)
        );

        ArrayList<Integer> result = nums.stream()
                .flatMap(List::stream)
                .filter(num -> num % 2 == 0 && num > 100)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(result);
    }
}
