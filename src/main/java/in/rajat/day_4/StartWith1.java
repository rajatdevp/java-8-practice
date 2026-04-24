package in.rajat.day_4;

import java.util.List;
import java.util.stream.Collectors;

//Find numbers starting with digit '1'
public class StartWith1 {

    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 15, 20, 100, 200, 110, 25);
        List<Integer> result = nums.stream()
                .filter(num -> String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());
        //result.add(1); from remove warring
        System.out.println(result);

    }

}
