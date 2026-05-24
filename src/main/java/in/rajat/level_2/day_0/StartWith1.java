package in.rajat.level_2.day_0;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StartWith1 {

	public static void main(String[] args){
         
         List<Integer> nums1 = List.of(10,20,15);
         List<Integer> nums2 = List.of(100,25,110);

         Predicate<Integer> isStartWith1 = num -> {
             int digit = 0;
             while(num > 0){
                digit = num%10;
             	num = num/10;

             }
          return digit == 1;
         };

        List<Integer> result = Stream.concat(nums1.stream(), nums2.stream())
              .filter(isStartWith1)
              .toList();

        System.out.println(result);

	}
}
