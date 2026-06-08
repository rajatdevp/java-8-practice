package in.rajat.level_3_string.day_3;

import java.util.Comparator;
import java.util.List;

public class DescendingByLength {

    public static void main(String[] args){

        List<String> list = List.of("a","abc","ab","abcd");

        List<String> result = list.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();

        System.out.println(result);

    }

}
