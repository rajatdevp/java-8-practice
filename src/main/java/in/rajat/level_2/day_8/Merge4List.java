package in.rajat.level_2.day_8;

import java.util.Arrays;
import java.util.stream.Stream;

public class Merge4List {

    public static void main(String[] args){

        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        int[] arr3 = {5,6};
        int[] arr4 = {7,8};

        long result = Arrays.asList(arr1, arr2, arr3, arr4)
                .stream()
                .flatMapToInt(Arrays::stream)
                .filter(n -> n % 2 == 0)
                .count();

        long result2 = Stream.of(arr1, arr2, arr3, arr4)
                .flatMapToInt(Arrays::stream)
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(result);
        System.out.println(result2);
    }
}
