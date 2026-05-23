package in.rajat.level_1.day_15;

import java.util.List;
import java.util.stream.Stream;

public class MergeRemoveDuplicate {

	public static void main(String[] args){

          List<Integer> nums1 = List.of(10,20,30);
		  List<Integer> nums2 = List.of(20,30,40);


		List<Integer> result1 =  Stream.of(nums1,nums2)//stream with array so return type is Stream<List<Integer>>
                .flatMap(List::stream)
                .distinct()
                .toList();
		System.out.println(result1);

		List<Integer> result2= Stream.concat(nums1.stream(),nums2.stream())//(Stream a, Stream b)
				.distinct()
				.toList();

		System.out.println(result2);

	}
}
