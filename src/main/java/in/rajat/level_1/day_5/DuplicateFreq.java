package in.rajat.level_1.day_5;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find duplicate elements + their frequency
public class DuplicateFreq {

    public static void main(String[] args){

       List<Integer> nums = List.of(10, 15, 10, 25, 15, 30, 10);
       Map<Integer, Long> result = nums.stream()
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
               .entrySet().stream()
               .filter(e -> e.getValue() > 1)
               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

       System.out.println(result);
       //{10=3, 15=2}
    }
}
