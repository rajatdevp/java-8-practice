package in.rajat.level_1.day_9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Cube each number and filter >100
public class CubeAndGreaterThen100 {

    public static void main(String[] args){

        int[] arr = {3, 4, 5, 1, 6, 2};

        List<Integer> result = Arrays.stream(arr)
                .map(num -> num* num* num )
                .filter(num -> num>100)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(result);
        //[125, 216]
    }
}
