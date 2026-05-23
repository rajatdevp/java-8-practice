package in.rajat.level_1.day_15;

import java.util.List;
import java.util.stream.Stream;

public class MergeAndSort {

	public static void main(String[] args){

		List<Integer> nums1 = List.of(50,10,30);
		List<Integer> nums2 = List.of(20,40);

		List<Integer> result = Stream.concat(nums1.stream(),nums2.stream())
                .sorted(Integer::compareTo)
                .toList();

		System.out.println(result);
        //[10, 20, 30, 40, 50]

	}

}
