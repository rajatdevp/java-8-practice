package in.rajat.level_2.day_7;

import java.util.Arrays;
import java.util.List;

public class FalettenAndDistinct {

    public static void main(String[] args){

        int[][] arr = {{2,4},{4,6},{8,2}};

        List<Integer> result = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .distinct().filter(n -> n%2 == 0)
                .boxed()
                .toList();

        System.out.println(result);
    }
}
