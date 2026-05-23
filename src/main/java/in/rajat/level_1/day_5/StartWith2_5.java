package in.rajat.level_1.day_5;

import java.util.List;
import java.util.stream.Collectors;

//Find numbers starting with '2' or '5'
public class StartWith2_5 {

    public static void main(String[] args){

        List<Integer> nums =List.of(20, 25, 50, 200, 500, 30, 55);
        List<Integer> result = nums.stream()
                                   .filter(n -> String.valueOf(n).startsWith("2")
                                           || String.valueOf(n).startsWith("5"))
                                   .collect(Collectors.toList());
        System.out.println(result);
    }
}
