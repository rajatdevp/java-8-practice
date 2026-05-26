package in.rajat.level_2.day_1;

import java.util.List;
import java.util.Optional;

public class FlattenAndSquaresSum {

	public static void main(String[] args){

           List<List<Integer>> nums = List.of(List.of(1,2,3),
           	                              List.of(4,5,6));

           Optional<Integer> result = nums.stream()
                   .flatMap(List::stream)
                   .filter(num-> num%2!=0)
                   .map(num-> num*num)
                   .reduce((a, b)-> a+b);

           System.out.println(result.orElse(0));//35
	}
    
}
