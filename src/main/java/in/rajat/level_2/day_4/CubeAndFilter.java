package in.rajat.level_2.day_4;

import java.util.List;
import java.util.stream.IntStream;

public class CubeAndFilter {

    public static void main(String[] args){

        List<Integer> nums = IntStream.range(1,11).boxed().toList();

        List<Integer> result = nums.stream()
                                   .filter(n -> Math.pow(n, 3) < 1000)
                                   .toList();

        System.out.println(result);
        //[1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

}
