package in.rajat.level_2.day_2;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

//Find average of numbers greater than 50 after merge
public class AverageGreater50 {

    public static void main(String[] args){

        List<Integer> nums1 =  List.of(40,60,70,30,80,55);
        List<Integer> nums2 =  List.of(10,20,30,40,50);

       OptionalDouble result = Stream.of(nums1,nums2)
               .flatMap(List::stream)
               .filter(nums -> nums > 50)
               .mapToInt(Integer::intValue).average();

       System.out.println(result.orElse(0.0));//66.25
    }
}
