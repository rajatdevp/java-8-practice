package in.rajat.level_2.day_1;

import java.util.List;
import java.util.stream.Stream;

public class MergeAndTop4 {

    public static void main(String[] args){

        List<Integer> list1 = List.of(10, 50);
        List<Integer> list2 = List.of(30, 80);
        List<Integer> list3 = List.of(20, 90);

        List<Integer> result = Stream.of(list1, list2, list3)
                .flatMap(List::stream)
                .sorted((a, b) -> a > b ? -1 : 1)
                .limit(4).toList();

        System.out.println(result);
    }
}
