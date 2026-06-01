package in.rajat.level_2.day_6;

import java.util.List;

public class Starts3AndEnds5 {

    public static void main(String[] args){

        List<Integer> nums = List.of(30,35,45,25,15, 23);

        List<Integer> result = nums.stream()
                .filter(num -> String.valueOf(num).startsWith("3") || String.valueOf(num).endsWith("5"))
                .toList();

        System.out.println(result);
        //[30, 35, 45, 25, 15]

    }
}
