package in.rajat.level_1.day_10;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.Collectors;


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

        IntSummaryStatistics result = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.summarizingInt(Integer::intValue));//Collectors.summarizingInt() is a shortcut
                                                                       //collector in Java 8 Streams that calculates
                                                                       //multiple statistics in one pass.like
                                                                       //1.count all passed value
                                                                       //2.sum of all 3.min 4.avg 5.max
                                                                       //summarizingInt need ToIntFunction pass object to int
        System.out.println(result.getMax());//50
        System.out.println(result.getMin());//10
        System.out.println(result);//IntSummaryStatistics{count=5, sum=150, min=10, average=30.000000, max=50}

    }
}
