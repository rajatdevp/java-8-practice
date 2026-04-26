package in.rajat.day_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Find numbers ending with digit '5'
public class EndsWith5 {

    public static void main(String[] args){
        int[] arr = new int[]{15, 25, 35, 45, 55, 65, 75};

        Predicate<Integer> endWith5 = n -> n%10 ==5;
        List<Integer> result = Arrays.stream(arr)
                                     .boxed()
                                     .filter(endWith5).toList();

        System.out.println(result);
    }
}
