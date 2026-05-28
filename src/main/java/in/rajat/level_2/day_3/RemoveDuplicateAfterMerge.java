package in.rajat.level_2.day_3;

import java.util.List;
import java.util.stream.Stream;

//Remove duplicates after merging three lists
public class RemoveDuplicateAfterMerge {

    public static void main(String[] args){

        List<Integer> nums1 = List.of(1, 2, 3, 4, 5);
        List<Integer> nums2 = List.of(1, 2, 3, 4, 5);
        List<Integer> nums3 = List.of(1, 2, 3, 4, 5);

        List<Integer> result = Stream.of(nums1, nums2, nums3)
                .flatMap(List::stream)
                .distinct().toList();

        System.out.println(result);
        //[1, 2, 3, 4, 5]
    }
}
