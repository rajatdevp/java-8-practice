package in.rajat.level_2.day_0;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FlatAndSecondHighest {

	public static void main(String[] args){

		var nums1 = List.of(50,30,80);
		var nums2 = List.of(70,90,40);

		var result = Stream.of(nums1, nums2).flatMap(List::stream)
                .sorted(Comparator.reverseOrder()).
                skip(1).findFirst();

        System.out.println(result.orElse(0));
    }
}
