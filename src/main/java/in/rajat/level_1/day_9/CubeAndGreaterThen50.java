package in.rajat.level_1.day_9;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CubeAndGreaterThen50 {

    public static void main(String[] arg){

        List<Integer> nums = List.of(3, 4, 5, 1, 6, 2);
        Function<Integer, Integer> powerMeth = num -> (int) Math.pow(num, 3);
        Predicate<Integer> greaterThen50 = num -> num > 50;

        List<Integer> result = nums.stream()
                .map(powerMeth)
                .filter(greaterThen50).toList();

        System.out.println(result);
        //[64, 125, 216]
    }
}
