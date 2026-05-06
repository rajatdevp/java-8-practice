package in.rajat.day_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class TopThree {

    public static void main(String[] args){

        int[] arr = {10, 50, 30, 80, 20, 90, 40};

        List<Integer> result = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(result);
        //[90, 80, 50]
    }
}
