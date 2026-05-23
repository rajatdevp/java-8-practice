package in.rajat.day_15;

import java.util.List;

public class MergeRemoveDuplicate {

	public static void main(String[] args){

		List<List<Integer>> nums =  List.of(
                                           List.of(10,20,30),
                                           List.of(20,30,40)
		                                   );

		List<Integer> result =  nums.stream()
                .flatMap(List::stream)
                .distinct()
                .toList();

		System.out.println(result);

	}
}
