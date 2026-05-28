package in.rajat.level_2.day_3;

import java.util.Comparator;
import java.util.List;

public class SortDescending {
    public static void main(String[] args){
        List<Integer> nums =  List.of(50,10,30,20,40);

        List<Integer> result = nums.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(result);
        //[50, 40, 30, 20, 10]
    }
}
