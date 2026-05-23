package in.rajat.level_1.day_6;

import java.util.List;

//Find all unique elements only
public class UniqeEle {

    public static void main(String[] at){

        List<Integer> list = List.of(10, 15, 10, 25, 15, 30, 10);

        List<Integer> result  = list.stream().distinct().toList();

        System.out.println(result);
        //[10, 15, 25, 30]
    }
}
