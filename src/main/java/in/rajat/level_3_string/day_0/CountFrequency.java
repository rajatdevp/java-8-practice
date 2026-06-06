package in.rajat.level_3_string.day_0;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountFrequency {

    public static void main(String[] args){

        String str = "JavaGuides";
        int[] arr  = {1,3,5,6};
        List<Integer> arr1 = List.of(2,5,6);

        System.out.println(Stream.of(arr).flatMapToInt(Arrays::stream)
                .count());//
        System.out.println(Stream.of(arr1).flatMap(List::stream)
                .count());

        Map<Character,Long> result = str.chars().mapToObj(ch -> (char)ch)
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);
    }
}
