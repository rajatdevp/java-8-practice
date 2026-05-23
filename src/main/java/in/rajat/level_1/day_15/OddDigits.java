package in.rajat.level_1.day_15;

import java.util.List;
import java.util.function.Predicate;

public class OddDigits {

	public static void main(String[] args){
           
           List<Integer> nums = List.of(10, 100, 999, 1000, 55);

           Predicate<Integer> isOddDigit = num -> {
              
              int count = 0;

              while(num>0){
               num =num/10;
               count++;
              }

              return count%2!=0;
           };

           List<Integer> result = nums.stream()
                                      .filter(isOddDigit)
                                      .toList();

            System.out.println(result);
	}

}
