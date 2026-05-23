package in.rajat.level_1.day_13;

import java.util.Arrays;
import java.util.List;

//Flatten List<List<Integer>> and find even numbers
public class FlattenAndFindEven {

	public static void main(String[] args){

		List<List<Integer>> nums = List.of(
             List.of(1,2,3),
             List.of(4,5,6),
             List.of(7,8,9)
		);

		List<Integer> result = nums.stream()
		                           .flatMap(List::stream)
		                           .filter(num -> num % 2 ==0).toList();

		System.out.println(result);

        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        List<Integer> result2 = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .filter(num -> num % 2 == 0).boxed().toList();

        System.out.println(result2);

	} 

}
