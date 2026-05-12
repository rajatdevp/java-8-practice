package in.rajat.day_10;

import java.util.Arrays;
import java.util.OptionalInt;


//Find max and min in one go using summarizingInt
public class MaxMin {

    public static void main(String[] args){

        int[] arr = {10, 20, 30, 40, 50};
        OptionalInt max = Arrays.stream(arr).max();
        OptionalInt min = Arrays .stream(arr).min();

        System.out.println(max);//OptionalInt[50]
        System.out.println(min);//OptionalInt[10]

        System.out.println(max.getAsInt());//50
        System.out.println(min.getAsInt());//10

    }
}
