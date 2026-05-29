package in.rajat.level_2.day_4;

import java.util.List;
import java.util.stream.IntStream;

public class SkipAndLimit {

    public static void main(String[] args){

       List<Integer> nums = IntStream.rangeClosed(1,12).boxed().toList();

       List<Integer> result  = nums.stream()
               .skip(3) //we pass any number even cross out length of stream it will not throw error
               .limit(5)// we pass any number even cross out length of stream it will not throw error
               .toList();

       System.out.println(result);
    }
}
